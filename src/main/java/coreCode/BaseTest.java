package coreCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static org.openqa.selenium.remote.BrowserType.*;


public class BaseTest {

     protected static WebDriver driver;
     public String browserType = CHROME; // <------ Change your desired browser here.


    public void getDriver() {

         if (driver != null) {
            return;
        }
        switch (browserType){
            case CHROME:

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case FIREFOX:

                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case IE:

                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;

            case EDGE:

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

        }
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.com");
    }

    @BeforeMethod
    public void setUp() {
         getDriver();

    }



    @AfterMethod
     public void drillDown() {
        if(driver != null)
            driver.quit();

     }

}
