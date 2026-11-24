package petclinic;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

public abstract class BaseTest {
    static final String BASE_URL = System.getProperty("petclinic.baseUrl", "http://localhost:8080");
    static Playwright playwright;
    static Browser browser;
    BrowserContext context;
    Page page;

    @BeforeAll
    static void launch() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
            new BrowserType.LaunchOptions().setHeadless(true));
    }

    @AfterAll
    static void shutdown() {
        browser.close();
        playwright.close();
    }

    @BeforeEach
    void setUp() throws IOException {
        Files.createDirectories(Paths.get("traces"));
        context = browser.newContext();
        context.tracing().start(new Tracing.StartOptions()
            .setScreenshots(true).setSnapshots(true).setSources(true));
        page = context.newPage();
        page.navigate(BASE_URL);
    }

    @AfterEach
    void tearDown(TestInfo info) {
        String name = info.getTestMethod().get().getName();
        context.tracing().stop(new Tracing.StopOptions()
            .setPath(Paths.get("traces/" + name + ".zip")));
        context.close();
    }

    // Helper: reused by several tests
    void addOwner(String first, String last, String address, String city, String phone) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Find owners")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Add Owner")).click();
        page.getByLabel("First Name").fill(first);
        page.getByLabel("Last Name").fill(last);
        page.getByLabel("Address").fill(address);
        page.getByLabel("City").fill(city);
        page.getByLabel("Telephone").fill(phone);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Owner")).click();
    }

    String unique(String prefix) {
        return prefix + UUID.randomUUID().toString().substring(0, 8);
    }

    void addPet(String name) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Add New Pet")).click();
        page.getByLabel("Name").fill(name);
        page.getByLabel("Birth Date").fill(LocalDate.now().minusYears(2).toString());
        page.getByLabel("Type").selectOption("cat");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Pet")).click();
    }
}
