package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://allegro.pl/");


       Alert alert = driver.switchTo().alert();
        alert.accept();


        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-role='search-input']")));
        searchField.sendKeys("Mavic mini");

        WebElement categoryDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@data-role='filters-dropdown']")));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByVisibleText("Elektronika");

        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-role='search-button']")));
        searchButton.click();

        driver.quit();
    }
}
