package pageObjects;

import coreCode.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class homePage extends BasePage {

    public homePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "header")
    public WebElement headerHomepage;

    @FindBy(id = "contact-link")
    public WebElement contactBtn;


}
