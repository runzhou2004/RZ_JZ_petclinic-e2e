import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("http://localhost:8080/");
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Find Owners")).click();
      page.locator("#lastName").click();
      page.locator("#lastName").fill("Hi");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Find Owner")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Add Owner")).click();
      page.getByLabel("First Name").click();
      page.getByLabel("First Name").fill("Hello");
      page.getByLabel("Last Name").click();
      page.getByLabel("Last Name").fill("Hi");
      page.getByLabel("Address").click();
      page.getByLabel("Address").fill("67 Six Seven St");
      page.getByLabel("City").click();
      page.getByLabel("City").fill("Houston");
      page.getByLabel("Telephone").click();
      page.getByLabel("Telephone").fill("6766766767");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Owner")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Add New Pet")).click();
      page.getByText("Name").click();
      page.getByLabel("Name").fill("Bird");
      page.getByLabel("Birth Date").fill("2026-11-17");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Pet")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Edit Owner")).click();
      page.getByLabel("City").click();
      page.getByLabel("City").fill("Austin");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Update Owner")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Edit Pet")).click();
      page.getByLabel("Birth Date").fill("2026-11-01");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Update Pet")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Add Visit")).click();
      page.getByLabel("Date").fill("2026-11-18");
      page.getByLabel("Description").click();
      page.getByLabel("Description").fill("Flea treatment");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Visit")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Veterinarians")).click();
      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("James Carter")).click();
      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Linda Douglas")).click();
      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Rafael Ortega")).click();
      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("radiology")).nth(1).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("")).click();
      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Sharon Jenkins")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Error")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Veterinarians")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Find Owners")).click();
      page.locator("#lastName").click();
      page.locator("#lastName").fill("W");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Find Owner")).click();
      page.locator("#lastName").click();
      page.locator("#lastName").fill("Hi");
      page.locator("#search-owner-form div").filter(new Locator.FilterOptions().setHasText("Find Owner")).nth(1).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Find Owner")).click();
      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("City")).click();
      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Address")).click();
    }
  }
}