package petclinic;

import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import com.microsoft.playwright.options.AriaRole;

class OwnerTest extends BaseTest {

    @Test
    void addOwner_showsOwnerInformation() {
        String last = unique("Owner");
        addOwner("Hello", last, "67 Six Seven St", "Houston", "6766766767");

        assertThat(page.getByRole(AriaRole.HEADING,
            new Page.GetByRoleOptions().setName("Owner Information"))).isVisible();
        assertThat(page.locator("table").first()).containsText("Hello " + last);
    }

    @Test
    void addOwnerShowsRequiredFieldValidation() {
        page.getByRole(AriaRole.LINK, new com.microsoft.playwright.Page.GetByRoleOptions()
            .setName("Find owners")).click();
        page.getByRole(AriaRole.LINK, new com.microsoft.playwright.Page.GetByRoleOptions()
            .setName("Add Owner")).click();
        page.getByRole(AriaRole.BUTTON, new com.microsoft.playwright.Page.GetByRoleOptions()
            .setName("Add Owner")).click();

        assertThat(page.locator(".has-error")).hasCount(5);
    }
}
