package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();

        if(youtubeTitle.contains("Video")){
            System.out.println("Title Video Kelimesini Iceriyor "+ youtubeTitle);
        }else{
            System.out.println("Title Video Kelimesini Icermiyor :" + youtubeTitle);
        }

        driver.quit();

    }
}

