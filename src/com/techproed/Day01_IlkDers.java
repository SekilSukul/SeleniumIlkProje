package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {


            //Bu komut Java Projesine chromedriver'i tanirir
            System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");


            //selenium ile ilgili ilk kodumuz
            //webdriver nesnesi olusturarak, chrome driver'i kullanilabilir hale getirdik.
            WebDriver webDriver = new ChromeDriver();

            //driver'a google'a gitmesini soyledik
            webDriver.get("http://google.com");

            //driver'imizda acik olan pencereyi kapatir
            webDriver.close();

            //driver'i tamamen kapatir
            webDriver.quit();





    }

}
