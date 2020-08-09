package testModule;

import coreCode.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.contactPage;
import pageObjects.homePage;

public class contactFormTest extends BaseTest {


@Test
    public void TC01_SendFeedback(){

    SoftAssert sAssert = new SoftAssert();
    contactPage contactpage = new contactPage(driver);
    homePage homepage = new homePage(driver);

    try {

        homepage.waitForScreenToLoad(homepage.headerHomepage);
        homepage.contactBtn.click();
        contactpage.waitForScreenToLoad(contactpage.messageBox);
        sAssert.assertEquals(contactpage.submitBtn.isDisplayed(),true);
        sAssert.assertAll();

    }catch (Exception e){
        e.printStackTrace();
        Assert.fail();
    }


}

}
