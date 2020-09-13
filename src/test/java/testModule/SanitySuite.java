package testModule;

import coreCode.BasePage;
import coreCode.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.contactPage;
import pageObjects.homePage;

public class SanitySuite extends BaseTest {


    @Test
    public void TC_04_VerifyMenu(){// Check all links from the Menu

        SoftAssert sAssert = new SoftAssert();
        contactPage contactpage = new contactPage(driver);
        homePage homepage = new homePage(driver);
        Actions ac = new Actions(driver);

        try{
            homepage.waitForScreenToLoad(homepage.headerHomepage);
            ac.moveToElement(homepage.dressMenu).moveToElement(homepage.casualDressMenu).build().perform();
            homepage.casualDressMenu.click();
            homepage.waitForScreenToLoad(homepage.titleBlock);
            sAssert.assertEquals(homepage.titleSubPage.getText(),"CASUAL DRESSES ");
            ac.moveToElement(homepage.dressMenu).moveToElement(homepage.evenDressMenu).click().build().perform();
            homepage.waitForScreenToLoad(homepage.titleBlock);
            sAssert.assertEquals(homepage.titleSubPage.getText(),"EVENING DRESSES ");
            ac.moveToElement(homepage.dressMenu).moveToElement(homepage.summerDressmMenu).click().build().perform();
            homepage.waitForScreenToLoad(homepage.titleBlock);
            sAssert.assertEquals(homepage.titleSubPage.getText(),"SUMMER DRESSES ");
            ac.moveToElement(homepage.womenMenu).moveToElement(homepage.topsMenu).click().build().perform();
            homepage.waitForScreenToLoad(homepage.titleBlock);
            sAssert.assertEquals(homepage.titleSubPage.getText(),"TOPS ");
            ac.moveToElement(homepage.womenMenu).moveToElement(homepage.blousesMenu).click().build().perform();
            homepage.waitForScreenToLoad(homepage.titleBlock);
            sAssert.assertEquals(homepage.titleSubPage.getText(),"BLOUSES ");
            homepage.waitForScreenToLoad(homepage.titleBlock);
            ac.moveToElement(homepage.tshirtMenu).click().perform();
            homepage.waitForScreenToLoad(homepage.titleBlock);
            sAssert.assertEquals(homepage.titleSubPage.getText(),"T-SHIRTS ");
            sAssert.assertAll();



        }catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


}
