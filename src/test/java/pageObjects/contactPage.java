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


    @FindBy(id = "submitMessage")
    public WebElement submitBtn;

    @FindBy(id = "id_order")
    public WebElement orderRefBox;

    @FindBy(id = "message")
    public WebElement messageBox;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "id_contact")
    public WebElement subjectDD;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p")
    public WebElement successMsg;








}
