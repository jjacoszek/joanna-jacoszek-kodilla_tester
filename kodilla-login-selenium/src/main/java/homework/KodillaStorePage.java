package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStorePage {
    private WebDriver driver;

    @FindBy(id = "search-input")
    private WebElement searchInput;

    @FindBy(css = ".search-icon")
    private WebElement searchIcon;

    public KodillaStorePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://kodilla.com/pl/test/store");
    }

    public void searchForPhrase(String phrase) {
        searchInput.sendKeys(phrase);
        searchIcon.click();
    }
}

