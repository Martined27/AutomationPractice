package coreCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

     protected static WebDriver driver;

     //to implement an enum

     public WebDriver getDriver(String browserName){
         if (driver != null) {
             return driver;
         }
        else
         if (browserName.equalsIgnoreCase("firefox")) {
             WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();

         } else if (browserName.equalsIgnoreCase("chrome")) {
             WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();


         }else if (browserName.equalsIgnoreCase("IE")) {
             WebDriverManager.iedriver().setup();
             driver = new InternetExplorerDriver();

         }

         driver.manage().window().maximize();
         driver.get("http://www.automationpractice.com");
         return driver;
     }
    @BeforeMethod
    public void setUp() {
         getDriver("firefox");
//         return driver;
    }



    @AfterMethod
     public void drillDown() {
        if(driver != null)
            driver.quit();

     }

}
