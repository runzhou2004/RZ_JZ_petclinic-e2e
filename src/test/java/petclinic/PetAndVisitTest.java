package petclinic;

import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

class PetAndVisitTest extends BaseTest {

    @Test
    void addPetAndScheduleVisit() {
        String ownerLastName = unique("PetOwner");
        String petName = unique("Milo");
        String visitDescription = unique("Checkup");
        String visitDate = LocalDate.now().toString();

        addOwner("Jordan", ownerLastName, "123 Test Street", "Austin", "5551234567");
        addPet(petName);

        assertThat(page.getByText(petName, new com.microsoft.playwright.Page.GetByTextOptions()
            .setExact(true))).isVisible();

        page.getByRole(AriaRole.LINK, new com.microsoft.playwright.Page.GetByRoleOptions()
            .setName("Add Visit")).click();
        page.getByLabel("Date").fill(visitDate);
        page.getByLabel("Description").fill(visitDescription);
        page.getByRole(AriaRole.BUTTON, new com.microsoft.playwright.Page.GetByRoleOptions()
            .setName("Add Visit")).click();

        assertThat(page.getByText(visitDescription, new com.microsoft.playwright.Page.GetByTextOptions()
            .setExact(true))).isVisible();
        assertThat(page.getByText(visitDate, new com.microsoft.playwright.Page.GetByTextOptions()
            .setExact(true))).isVisible();
    }
}
