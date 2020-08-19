package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02Navigations {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver(); //chrome'u acmaya yarar
        webDriver.manage().window().maximize(); //acilan pencereyi tam ekran yapmaya yarar

        webDriver.get("http://google.com");

        //navigate.to komutu get komutu ile ayni islemi yapiyor.
        webDriver.navigate().to("http://amazon.com");

        //back komutu bir onceki sayfaya geri donmemize yarar
        webDriver.navigate().back();

        //forward komutu bir sonraki sayfaya gecis yapmamiza yarar
        webDriver.navigate().forward();

        //refresh komutu sayfayi yenilememize yarar
        webDriver.navigate().refresh();






    }

}
