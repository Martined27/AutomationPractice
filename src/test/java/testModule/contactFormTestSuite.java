package testModule;

import coreCode.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.contactPage;
import pageObjects.homePage;

public class contactFormTestSuite extends BaseTest {


    @Test
    public void TC01_SendMessageCustomerService() { //Send a successful message with customer service

        SoftAssert sAssert = new SoftAssert();
        contactPage contactpage = new contactPage(driver);
        homePage homepage = new homePage(driver);

        try {

            homepage.waitForScreenToLoad(homepage.headerHomepage);
            homepage.contactBtn.click();
            contactpage.waitForScreenToLoad(contactpage.messageBox);
            sAssert.assertEquals(contactpage.submitBtn.isDisplayed(), true, "Submit button is displayed");
            contactpage.fromDropdownList(contactpage.subjectDD).selectByIndex(1);
            sAssert.assertEquals(contactpage.fromDropdownList(contactpage.subjectDD).getFirstSelectedOption().getText(), "Customer service", "Correct Selection");
            contactpage.emailBox.sendKeys("remotejob@plea.se");
            contactpage.orderRefBox.click();
            sAssert.assertEquals(contactpage.validateElementExistence(By.xpath("//p[@class='form-group form-ok']")),true, "Email is valid");
            contactpage.orderRefBox.sendKeys("2500");
            contactpage.messageBox.sendKeys("this is an automated test");
            contactpage.fileUpload.sendKeys(testFilePng);
            sAssert.assertEquals(contactpage.fileBox.getText(), "test.png");
            contactpage.submitBtn.click();
            contactpage.waitForScreenToLoad(By.xpath("/html/body/div/div[2]/div/div[3]/div/p"));
            sAssert.assertEquals(contactpage.successMsg.getText().contains("successfully sent"), true);
            sAssert.assertAll();



        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }


    }




    @Test
    public void TC02_SendMessageWebmaster() { //Send a successful message with webmaster

        SoftAssert sAssert = new SoftAssert();
        contactPage contactpage = new contactPage(driver);
        homePage homepage = new homePage(driver);

        try {
            homepage.waitForScreenToLoad(homepage.headerHomepage);
            homepage.contactBtn.click();
            contactpage.waitForScreenToLoad(contactpage.messageBox);
            sAssert.assertEquals(contactpage.submitBtn.isDisplayed(), true, "Submit button is displayed");
            contactpage.fromDropdownList(contactpage.subjectDD).selectByIndex(2);
            sAssert.assertEquals(contactpage.fromDropdownList(contactpage.subjectDD).getFirstSelectedOption().getText(), "Webmaster", "Correct Selection Webmaster");
            contactpage.emailBox.sendKeys("remotejob@plea.se");
            contactpage.orderRefBox.click();
            sAssert.assertEquals(contactpage.validateEmail.getAttribute("class"), "form-group form-ok", "Valid Email: Class changes to form-ok when email is valid");
            contactpage.orderRefBox.sendKeys("1500");
            contactpage.messageBox.sendKeys("this is an automated test for webmaster");
            contactpage.fileUpload.sendKeys(testFilePng);
            sAssert.assertEquals(contactpage.fileBox.getText(), "test.png");
            contactpage.submitBtn.click();
            contactpage.waitForScreenToLoad(By.xpath("/html/body/div/div[2]/div/div[3]/div/p"));
            sAssert.assertEquals(contactpage.successMsg.getText().contains("successfully sent"), true);
            sAssert.assertAll();

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }


}

