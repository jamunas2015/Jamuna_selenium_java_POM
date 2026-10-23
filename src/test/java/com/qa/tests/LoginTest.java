package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.utilities.waitUtility;
import com.qa.utilities.ScreenshotUtils;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() throws InterruptedException {

        LoginPage loginPage =
                new LoginPage(driver);
      //  Thread.sleep(10000);
        loginPage.enterUsername("Admin");

        loginPage.enterPassword("admin123");

        loginPage.clickLogin();
        
        ScreenshotUtils.captureScreenshot(driver, "LoginTest");
        
        waitUtility.waitForUrlContains(driver, "dashboard");
        
        String currentUrl = driver.getCurrentUrl();
        
        Assert.assertTrue(currentUrl.contains("dashboard"));
        Thread.sleep(10000);
    }
}
