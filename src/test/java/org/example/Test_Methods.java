package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Test_Methods {
    WebDriver driver;
    @BeforeMethod
    public void beforetest(){
        System.setProperty("webdriver.chrome.driver","/home/saurav/IdeaProjects/AssingmentAgriChain/src/main/java/DriverFiles/chromedriver");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qa.top-doc.com/");

    }


    @AfterMethod
    public void aftertest(){
        driver.quit();
    }
}
