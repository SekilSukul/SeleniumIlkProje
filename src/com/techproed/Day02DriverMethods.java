package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.get("http://amazon.com");

        String sayfaTitle = driver.getTitle(); //sayfanin Title'ini alip ekrana yazdirir
        String sayfaUrl = driver.getCurrentUrl(); //sayfanin Url'sini alip ekrana yazdirir

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);


    }
}
