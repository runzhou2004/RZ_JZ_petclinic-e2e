package petclinic;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VeterinarianTest extends BaseTest {

    @Test
    void veterinarianDirectoryShowsNamesAndSpecialties() {
        page.locator("a[href='/vets.html']").click();

        assertThat(page.getByRole(AriaRole.HEADING,
            new com.microsoft.playwright.Page.GetByRoleOptions().setName("Veterinarians"))).isVisible();
        assertThat(page.locator("#vets thead")).containsText("Specialties");
        assertTrue(page.locator("#vets tbody tr").count() > 0,
            "The veterinarian directory should contain at least one veterinarian");
    }
}
