package petclinic;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

class FindOwnerTest extends BaseTest {

    @Test
    void findOwner_singleMatch_showsOwnerPage() {
        String lastName = unique("Find");
        addOwner("Taylor", lastName, "123 Test Street", "Austin", "5551234567");

        page.getByRole(AriaRole.LINK, new com.microsoft.playwright.Page.GetByRoleOptions()
            .setName("Find owners")).click();
        page.locator("#lastName").fill(lastName);
        page.getByRole(AriaRole.BUTTON,
            new com.microsoft.playwright.Page.GetByRoleOptions().setName("Find Owner")).click();

        assertThat(page.getByRole(AriaRole.HEADING,
            new com.microsoft.playwright.Page.GetByRoleOptions().setName("Owner Information"))).isVisible();
        assertThat(page.locator("table").first()).containsText("Taylor " + lastName);    
    }

    @Test
    void findOwner_multipleMatches_showsList() {
        page.getByRole(AriaRole.LINK, new com.microsoft.playwright.Page.GetByRoleOptions()
            .setName("Find owners")).click();
        page.locator("#lastName").fill("Davis");
        page.getByRole(AriaRole.BUTTON,
            new com.microsoft.playwright.Page.GetByRoleOptions().setName("Find Owner")).click();
    
        assertThat(page.getByRole(AriaRole.LINK,
            new com.microsoft.playwright.Page.GetByRoleOptions().setName("Betty Davis"))).isVisible();
        assertThat(page.getByRole(AriaRole.LINK,
            new com.microsoft.playwright.Page.GetByRoleOptions().setName("Harold Davis"))).isVisible();
    }

    @Test
    void findOwnerNoMatchShowsNotFound() {
        page.getByRole(AriaRole.LINK, new com.microsoft.playwright.Page.GetByRoleOptions()
            .setName("Find owners")).click();
        page.locator("#lastName").fill(unique("Missing"));
        page.getByRole(AriaRole.BUTTON,
            new com.microsoft.playwright.Page.GetByRoleOptions().setName("Find Owner")).click();

        assertThat(page.getByText("has not been found")).isVisible();
    }
}
