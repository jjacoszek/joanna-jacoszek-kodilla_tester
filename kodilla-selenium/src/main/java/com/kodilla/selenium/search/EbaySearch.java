package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbaySearch {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver-win32\\chromedriver.exe");  	// [1]
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://www.ebay.com/");

        WebElement inputField = driver.findElement(By.id("gh-ac"));
        inputField.sendKeys("Laptop");
        inputField.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.titleContains("Laptop"));

        driver.quit();
    }
}
