package homework;import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePageTest {

    private WebDriver driver;
    private KodillaStorePage kodillaStorePage;

    @BeforeEach
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver-win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");


        driver = new ChromeDriver(options);

        kodillaStorePage = new KodillaStorePage(driver);
    }

    @Test
    public void testOpenPage() {
        kodillaStorePage.open();
        String pageTitle = driver.getTitle();
        assertEquals("Kodilla Store", pageTitle, "Page title should be 'Kodilla Store'");
    }

    @Test
    public void testSearchForPhrase() {
        kodillaStorePage.open();
        kodillaStorePage.searchForPhrase("laptop");

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}