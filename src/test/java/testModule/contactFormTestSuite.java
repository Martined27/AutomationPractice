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
    public void CF01_SendMessage_Subject_Blank() { //Verify that a message cant be sent with No subject

        SoftAssert sAssert = new SoftAssert();
        contactPage contactpage = new contactPage(driver);
        homePage homepage = new homePage(driver);

        try {

            homepage.waitForScreenToLoad(homepage.headerHomepage);
            homepage.contactBtn.click();
            contactpage.waitForScreenToLoad(contactpage.messageBox);
            sAssert.assertEquals(contactpage.submitBtn.isDisplayed(), true, "Submit button is displayed");
            sAssert.assertEquals(contactpage.fromDropdownList(contactpage.subjectDD).getFirstSelectedOption().getText(), "-- Choose --", "Subject Heading is Blank");
            contactpage.emailBox.sendKeys("remotejob@plea.se");
            contactpage.orderRefBox.sendKeys("A34234");
            contactpage.messageBox.sendKeys("this is an automated test");
            contactpage.fileUpload.sendKeys(testFilePng);
            contactpage.submitBtn.click();
            contactpage.waitForScreenToLoad(contactpage.submitBtn);
            sAssert.assertEquals(contactpage.errorMsg.getText(), "There is 1 error\n" +
                    "Please select a subject from the list provided.");
            sAssert.assertAll();



        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }


    }

    @Test
    public void CF02_SendMessage_Email_Blank() { //Verify that a message cant be sent with No email

        SoftAssert sAssert = new SoftAssert();
        contactPage contactpage = new contactPage(driver);
        homePage homepage = new homePage(driver);

        try {

            homepage.waitForScreenToLoad(homepage.headerHomepage);
            homepage.contactBtn.click();
            contactpage.waitForScreenToLoad(contactpage.messageBox);
            contactpage.fromDropdownList(contactpage.subjectDD).selectByIndex(1);
            sAssert.assertEquals(contactpage.fromDropdownList(contactpage.subjectDD).getFirstSelectedOption().getText(), "Customer service", "Subject Heading is populated");
            contactpage.emailBox.sendKeys("");
            contactpage.orderRefBox.sendKeys("A34234");
            contactpage.messageBox.sendKeys("this is an automated test");
            contactpage.fileUpload.sendKeys(testFilePng);
            contactpage.submitBtn.click();
            contactpage.waitForScreenToLoad(contactpage.submitBtn);
            sAssert.assertEquals(contactpage.errorMsg.getText(), "There is 1 error\n" +
                    "Invalid email address.");
            sAssert.assertAll();



        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }


    }

    @Test
    public void CF03_SendMessage_Invalid_Email() { //Verify that a message cant be sent with Invalid email

        SoftAssert sAssert = new SoftAssert();
        contactPage contactpage = new contactPage(driver);
        homePage homepage = new homePage(driver);

        try {

            homepage.waitForScreenToLoad(homepage.headerHomepage);
            homepage.contactBtn.click();
            contactpage.waitForScreenToLoad(contactpage.messageBox);
            contactpage.fromDropdownList(contactpage.subjectDD).selectByIndex(1);
            sAssert.assertEquals(contactpage.fromDropdownList(contactpage.subjectDD).getFirstSelectedOption().getText(), "Customer service", "Subject Heading is populated");
            contactpage.emailBox.sendKeys("test");
            contactpage.orderRefBox.click(); // For email field to trigger the verification.
            sAssert.assertEquals(contactpage.validateElementExistence(By.xpath("//p[@class='form-group form-error']")),true, "Email is invalid");
            contactpage.orderRefBox.sendKeys("A34234");
            contactpage.messageBox.sendKeys("this is an automated test");
            contactpage.fileUpload.sendKeys(testFilePng);
            contactpage.submitBtn.click();
            contactpage.waitForScreenToLoad(contactpage.submitBtn);
            sAssert.assertEquals(contactpage.errorMsg.getText(), "There is 1 error\n" +
                    "Invalid email address.");
            sAssert.assertAll();



        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }


    }

    @Test
    public void CF04_SendMessage_OrderReference_Blank() { //Verify that a message cant be sent with No Order Reference


        SoftAssert sAssert = new SoftAssert();
        contactPage contactpage = new contactPage(driver);
        homePage homepage = new homePage(driver);

        try {

            homepage.waitForScreenToLoad(homepage.headerHomepage);
            homepage.contactBtn.click();
            contactpage.waitForScreenToLoad(contactpage.messageBox);
            contactpage.fromDropdownList(contactpage.subjectDD).selectByIndex(1);
            sAssert.assertEquals(contactpage.fromDropdownList(contactpage.subjectDD).getFirstSelectedOption().getText(), "Customer service", "Subject Heading is populated");
            contactpage.emailBox.sendKeys("remote@job.com");
            contactpage.orderRefBox.sendKeys("");
            contactpage.messageBox.sendKeys("this is an automated test");
            contactpage.fileUpload.sendKeys(testFilePng);
            contactpage.submitBtn.click();
            contactpage.waitForScreenToLoad(contactpage.submitBtn);
            sAssert.assertEquals(contactpage.errorMsg.getText(), "There is 1 error\n" +
                    "No Order Reference.");
            sAssert.assertAll();



        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }


    }

    @Test
    public void CF05_SendMessage_AttachFile_Blank() { //Verify that a message cant be sent with No Attachment


        SoftAssert sAssert = new SoftAssert();
        contactPage contactpage = new contactPage(driver);
        homePage homepage = new homePage(driver);

        try {

            homepage.waitForScreenToLoad(homepage.headerHomepage);
            homepage.contactBtn.click();
            contactpage.waitForScreenToLoad(contactpage.messageBox);
            contactpage.fromDropdownList(contactpage.subjectDD).selectByIndex(1);
            sAssert.assertEquals(contactpage.fromDropdownList(contactpage.subjectDD).getFirstSelectedOption().getText(), "Customer service", "Subject Heading is populated");
            contactpage.emailBox.sendKeys("remote@job.com");
            contactpage.orderRefBox.sendKeys("A25135");
            contactpage.messageBox.sendKeys("this is an automated test");
            //no action for attach file
            contactpage.submitBtn.click();
            contactpage.waitForScreenToLoad(contactpage.submitBtn);
            sAssert.assertEquals(contactpage.errorMsg.getText(), "There is 1 error\n" +
                    "No attachment");
            sAssert.assertAll();



        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }


    }

    @Test
    public void CF06_SendMessage_Message_Blank() { //Verify that a message cant be sent with No Message body


        SoftAssert sAssert = new SoftAssert();
        contactPage contactpage = new contactPage(driver);
        homePage homepage = new homePage(driver);

        try {

            homepage.waitForScreenToLoad(homepage.headerHomepage);
            homepage.contactBtn.click();
            contactpage.waitForScreenToLoad(contactpage.messageBox);
            contactpage.fromDropdownList(contactpage.subjectDD).selectByIndex(1);
            sAssert.assertEquals(contactpage.fromDropdownList(contactpage.subjectDD).getFirstSelectedOption().getText(), "Customer service", "Subject Heading is populated");
            contactpage.emailBox.sendKeys("remote@job.com");
            contactpage.orderRefBox.sendKeys("A3555");
            contactpage.messageBox.sendKeys(""); // Empty message box.
            contactpage.fileUpload.sendKeys(testFilePng);
            contactpage.submitBtn.click();
            contactpage.waitForScreenToLoad(contactpage.submitBtn);
            sAssert.assertEquals(contactpage.errorMsg.getText(), "There is 1 error\n" +
                    "The message cannot be blank.");
            sAssert.assertAll();



        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }


    }

    @Test
    public void CF07_SendMessageCustomerService() { //Send a successful message with customer service

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
    public void CF08_SendMessageWebmaster() { //Send a successful message with webmaster

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
            sAssert.assertEquals(contactpage.validateElementExistence(By.xpath("//p[@class='form-group form-ok']")),true, "Email is valid");
            //sAssert.assertEquals(contactpage.validateEmail.getAttribute("class"), "form-group form-ok", "Valid Email: Class changes to form-ok when email is valid");
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

