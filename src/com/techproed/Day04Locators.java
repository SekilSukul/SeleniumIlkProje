package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // webelementimizi id kullanarak bulduk.
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        // webelementimize tıkladık.
        signInLink.click();

        WebElement emailKutusu = driver.findElement(By.className("form-control"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement singInButonu = driver.findElement(By.name("commit"));
        singInButonu.click();







    }
}
