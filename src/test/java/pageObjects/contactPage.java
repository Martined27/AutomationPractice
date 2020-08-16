package pageObjects;

import coreCode.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class contactPage extends BasePage {


    public contactPage(WebDriver driver) {
        super(driver);
    }



    //<editor-fold desc="Web Elements">
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

    @FindBy(id = "desc_contact2")
    public WebElement subjectDesc;

    @FindBy(id = "fileUpload")

    public WebElement fileUpload;

    @FindBy(xpath = "//*[@id=\"uniform-fileUpload\"]/span[1]")
    public WebElement fileBox;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p")
    public WebElement successMsg;

    @FindBy(xpath = "//p[@class='form-group form-ok']")
    public WebElement validateEmail;

    public String validate = "//p[@class='form-group form-ok']";
    //</editor-fold>


    }







