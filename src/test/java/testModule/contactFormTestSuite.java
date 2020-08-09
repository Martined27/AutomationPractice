package testModule;

import coreCode.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.contactPage;
import pageObjects.homePage;

public class contactFormTestSuite extends BaseTest {


@Test
    public void TC01_SendMessageCustomerService(){ //Send a successful message with custumer service

    SoftAssert sAssert = new SoftAssert();
    contactPage contactpage = new contactPage(driver);
    homePage homepage = new homePage(driver);

    try {
        homepage.waitForScreenToLoad(homepage.headerHomepage);
        homepage.contactBtn.click();
        contactpage.waitForScreenToLoad(contactpage.messageBox);
        sAssert.assertEquals(contactpage.submitBtn.isDisplayed(),true,"Submit button is displayed");
        contactpage.fromDropdownList(contactpage.subjectDD).selectByIndex(1);
        sAssert.assertEquals(contactpage.fromDropdownList(contactpage.subjectDD).getFirstSelectedOption().getText(),"Customer service", "Correct Selection");
        contactpage.emailBox.sendKeys("remotejob@plea.se");
        contactpage.orderRefBox.sendKeys("2500");
        contactpage.messageBox.sendKeys("this is an automated test");
        contactpage.submitBtn.click();
        contactpage.waitForScreenToLoad(By.xpath("/html/body/div/div[2]/div/div[3]/div/p"));
        sAssert.assertEquals(contactpage.successMsg.getText().contains("successfully sent"),true);
        sAssert.assertAll();

    }catch (Exception e){
        e.printStackTrace();
        Assert.fail();
    }


}

}