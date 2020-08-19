package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02DriverOdev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");
        String sayfaTitle1 = driver.getTitle();
        System.out.println(sayfaTitle1);

        driver.get("http://youtube.com");
        String sayfaTitle2 = driver.getTitle();
        String sayfaUrl2=driver.getCurrentUrl();

        System.out.println(sayfaTitle2);
        System.out.println(sayfaUrl2);

        driver.navigate().back();

        String sayfaUrl1 = driver.getCurrentUrl();
        System.out.println(sayfaUrl1);

        driver.quit();





    }
}
