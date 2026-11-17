package petclinic;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

class FindOwnerTest {
    static Playwright playwright;
    static Browser browser;
    BrowserContext context;
    Page page;

    @BeforeAll
    static void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
            new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(300));
    }

    @AfterAll
    static void closeBrowser() {
        browser.close();
        playwright.close();
    }

    @BeforeEach
    void createContext() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

    @Test
    void findOwnersListsResults() {
        page.navigate("http://localhost:8080");
        page.getByRole(AriaRole.LINK,
            new Page.GetByRoleOptions().setName("Find owners")).click();
        page.getByRole(AriaRole.BUTTON,
            new Page.GetByRoleOptions().setName("Find Owner")).click();

        assertThat(page.getByRole(AriaRole.HEADING,
            new Page.GetByRoleOptions().setName("Owners"))).isVisible();
    }
}