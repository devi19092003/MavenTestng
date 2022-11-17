package Asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAsserts {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("Before Method Example");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void run1(){
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Google","title should be match");
        Assert.assertNotEquals(title,"google","String should be corrected");
        Assert.assertFalse(title.contains("google"),"string should be google");
        System.out.println(title);
    }


    @AfterMethod
    public void afterMethodExample(){
        System.out.println("After Method Example");
        driver.close();
    }



}
