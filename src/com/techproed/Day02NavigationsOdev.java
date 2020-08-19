package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02NavigationsOdev {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http:google.com");
        webDriver.manage().window().maximize();
        webDriver.get("http:youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();


    }
}
