package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreSearchExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver-win32\\chromedriver.exe");  	// [1]
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://kodilla.com/pl/test/store");

        WebElement inputField = driver.findElement(By.name("search")); // [4]
        inputField.sendKeys("School");
        inputField.submit();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("my Class")));
    }
}
