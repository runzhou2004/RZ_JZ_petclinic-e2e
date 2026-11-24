package petclinic;

import com.microsoft.playwright.*;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApiSmokeTest {
    private static final String BASE_URL = System.getProperty("petclinic.baseUrl", "http://localhost:8080");
    private static Playwright playwright;

    @BeforeAll
    static void createPlaywright() {
        playwright = Playwright.create();
    }

    @AfterAll
    static void closePlaywright() {
        playwright.close();
    }

    @Test
    void veterinarianPageCanBeCheckedWithPlaywrightApiRequest() {
        APIRequestContext request = playwright.request().newContext();
        try {
            APIResponse response = request.get(BASE_URL + "/vets.html");
            assertEquals(200, response.status());
            assertTrue(response.text().contains("Veterinarians"));
        } finally {
            request.dispose();
        }
    }
}
