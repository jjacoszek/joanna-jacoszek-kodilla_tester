package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://allegro.pl/");

       // driver.switchTo().alert().accept();

        WebElement confirmButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.captcha_display_button_submit")));
        confirmButton.click();

        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-role='search-input']")));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.cssSelector("button[data-role='search-button']"));
        searchButton.click();

        WebElement firstResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("section>article"));
        for (WebElement productCard : productCards) {
            System.out.println("Informacje o produkcie:");
            System.out.println(productCard.getText());
            System.out.println("----------------------------------");
        }
        driver.quit();
    }
}

