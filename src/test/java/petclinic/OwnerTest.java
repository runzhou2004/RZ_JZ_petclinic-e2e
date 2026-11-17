package petclinic;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Page;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import com.microsoft.playwright.options.AriaRole;

class OwnerTest extends BaseTest {

    @Test
    void addOwner_showsOwnerInformation() {
        String last = "Test" + System.currentTimeMillis();
        addOwner("Hello", last, "67 Six Seven St", "Houston", "6766766767");

        assertThat(page.getByRole(AriaRole.HEADING,
            new Page.GetByRoleOptions().setName("Owner Information"))).isVisible();
        assertThat(page.locator("table").first()).containsText(last);
    }

    @Test
    void findOwner_noMatch_showsNotFound() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Find Owners")).click();
        page.getByLabel("Last Name").fill("Nonexistent" + System.currentTimeMillis());
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Find Owner")).click();

        assertThat(page.getByText("has not been found")).isVisible();
    }
}