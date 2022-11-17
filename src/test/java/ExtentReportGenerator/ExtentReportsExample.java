package ExtentReportGenerator;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class ExtentReportsExample {

    public class TestNgDataProviderUsingExcelSheet {

        WebDriver driver;

        ExtentReports reports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("TestEveningReporter.html");
        ExtentTest test;

        @BeforeTest
        public void beforeTest(){
            reports.attachReporter(sparkReporter);
        }

        @Parameters({"browserName"})
        @BeforeMethod
        public void testScript(String browserName) {
            if (browserName.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equals("edge")) {
                System.setProperty("webdriver.edge.driver", "C:\\Users\\LENOVO\\Downloads\\edgedriver_win64\\msedgedriver.exe");
                driver = new EdgeDriver();
            } else {
                System.out.println("please select correct browser");
            }
        }

        @Test
        public void testScript1(){
            test = reports.createTest("Launch the browser").assignAuthor("Jagruti").assignDevice("chrome");
            SoftAssert softAssert = new SoftAssert();
            driver.get("https://www.google.com");
            String s = driver.getTitle();
            softAssert.assertEquals(s,"Google");
            test.pass("test is pass");
            softAssert.assertAll();
        }

        @Test
        public void testScript2(){
            test = reports.createTest("Launch the browser").assignAuthor("Bharat").assignDevice("firefox");
            SoftAssert softAssert = new SoftAssert();
            driver.get("https://www.google.com");
            String s = driver.getTitle();
            softAssert.assertEquals(s,"google");
            test.fail("test is fail");
            softAssert.assertAll();
        }

        @Test
        public void testScript3(){
            test = reports.createTest("Launch the browser").assignAuthor("Devendra").assignDevice("edge");
            SoftAssert softAssert = new SoftAssert();
            driver.get("https://www.google.com");
            String s = driver.getTitle();
            softAssert.assertEquals(s,"Google");
            test.pass("test is pass");
            softAssert.assertAll();
        }

        @Test
        public void testScript4(){
            test = reports.createTest("Launch the browser").assignAuthor("Mangala").assignDevice("android");
            SoftAssert softAssert = new SoftAssert();
            driver.get("https://www.google.com");
            String s = driver.getTitle();
            softAssert.assertEquals(s,"google");
            test.fail("test is fail");
            softAssert.assertAll();
        }

        @Test
        public void testScript5(){
            test = reports.createTest("Launch the browser").assignAuthor("Neelam").assignDevice("iphone");
            SoftAssert softAssert = new SoftAssert();
            driver.get("https://www.google.com");
            String s = driver.getTitle();
            softAssert.assertEquals(s,"Google");
            test.pass("test is pass");
            softAssert.assertAll();
        }

        @Test(enabled = false)
        public void testScript6(){
            test = reports.createTest("Launch the browser");
            SoftAssert softAssert = new SoftAssert();
            driver.get("https://www.google.com");
            String s = driver.getTitle();
            softAssert.assertEquals(s,"google");
            test.fail("test is fail");
            softAssert.assertAll();
        }

        @AfterMethod
        public void afterMethodExample() {
            driver.close();
        }

        @AfterTest
        public void afterTest(){
            reports.flush();
        }


    }

    }
