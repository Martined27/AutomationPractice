package coreCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    //<editor-fold desc="Global Variables">
    protected WebDriver driver;
    private static final int TIMEOUT = 6;
    private final WebDriverWait wait;
    //</editor-fold>

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }



    //Internal methods
    protected void waitForElementToAppear(By locator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }




    //Helper methods
    public Select fromDropdownList(WebElement elemDD) { return new Select(elemDD); }
    public void waitForScreenToLoad(By locator) {
        waitForElementToAppear(locator);
    }

    public void waitForScreenToLoad(WebElement element ) {
        waitForElementToAppear(By.id(element.getAttribute("id")));
    }


}
