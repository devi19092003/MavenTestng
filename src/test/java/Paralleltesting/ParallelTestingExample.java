package Paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParallelTestingExample {


    SoftAssert softAssert = new SoftAssert();

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
        softAssert.assertEquals(title,"google","title should be match");
        System.out.println(title);

    }

    @Test
    public void run2(){
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        softAssert.assertEquals(title,"google","title should be match");
        System.out.println(title);

    }

    @Test
    public void run3(){
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        softAssert.assertEquals(title,"google","title should be match");
        System.out.println(title);

    }


    @AfterMethod
    public void afterMethodExample(){
        System.out.println("After Method Example");
        driver.close();
    }
}
