package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("City Bike");
        searchBox.submit(); // submit() enter gorevi gorur

        WebElement resultStats = driver.findElement(By.id("result-stats"));
        resultStats.getText();

        WebElement shoppingLink = driver.findElement(By.partialLinkText("ver"));
        shoppingLink.click();


    }
}
