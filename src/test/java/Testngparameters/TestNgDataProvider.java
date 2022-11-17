package Testngparameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class TestNgDataProvider {

    WebDriver driver;

    @DataProvider(name = "test-data")
      public Object[][] dataProviderFun(){
       return new Object[][]{{"selenium","pune"},{"java","mumbai"}};
    }

    @Parameters({"browserName"})
    @BeforeMethod
    public void testScript(String browserName)
    {
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserName.equals("edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("please select correct browser");
        }
    }


    @Test(dataProvider = "test-data")
    public void run1(String s1 , String s2){
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(s1+""+s2);
        element.sendKeys(Keys.ENTER);
    }


    @Test(dataProvider = "test-data")
    public void run2(String s1 , String s2){
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(s1+""+s2);
        element.sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }

}