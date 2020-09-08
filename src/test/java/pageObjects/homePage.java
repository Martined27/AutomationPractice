package pageObjects;

import coreCode.BasePage;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public WebElement dressMenu;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")
    public WebElement casualDressMenu;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public WebElement womenMenu;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a")
    public WebElement blousesMenu;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/a")
    public WebElement topsMenu;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    public WebElement evenDressMenu;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
    public WebElement summerDressmMenu;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement tshirtMenu;

    @FindBy(id = "layered_block_left")
    public WebElement titleBlock;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[1]")
    public WebElement titleSubPage;




}
