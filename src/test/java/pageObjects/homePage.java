package pageObjects;

import coreCode.BasePage;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage extends BasePage {

    public homePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "header")
    public WebElement headerHomepage;




}
