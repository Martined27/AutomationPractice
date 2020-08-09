package pageObjects;

import coreCode.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class contactPage extends BasePage {

    public contactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "contact-link")
    public WebElement contactBtn;
    
    @FindBy(id = "submitMessage")
    public WebElement submitBtn;

    @FindBy(id = "message")
    public WebElement messageBox;

    @FindBy(id = "uniform-id_contact")
    public WebElement subject;




//to implement a dropdownlist method.




}
