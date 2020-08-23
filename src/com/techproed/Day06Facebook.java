package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06Facebook {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver" , "C:/Users/ahmtt/OneDrive/Dokumente/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://facebook.com");

        WebElement emailKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        emailKutusu.sendKeys("techproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@type='password']"));
        sifreKutusu.sendKeys("Test1234");

        WebElement loginButonu = driver.findElement(By.cssSelector("button#u_0_d"));
        loginButonu.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        String url = driver.getCurrentUrl();
        System.out.println(url);

        if (url.contains("facebook.com/login/")){
            System.out.println("Giris Basarisiz");
        }else{
            System.out.println("Giris Basarili");
        }

        driver.quit();






    }
}
