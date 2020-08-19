package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02IfElse {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        String sayfaBasligi = driver.getTitle();


        if(sayfaBasligi.contains("Books")){
            System.out.println("Books Kelimesi Iceriyor: " + sayfaBasligi);
        }else{
            System.out.println("Books Kelimesi Icermiyor: " + sayfaBasligi);
        }

        driver.quit();




    }
}
