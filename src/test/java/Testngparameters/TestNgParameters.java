package Testngparameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestNgParameters {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Parameters({"s1","s2"})
    @Test
    public void run1(String s1,String s2){
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(s1+" "+s2);
        element.sendKeys(Keys.ENTER);
    }

    @Parameters({"s1","s2"})
    @Test
    public void run2(String s1, String s2){
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(s1+" "+s2);
        element.sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }

}
