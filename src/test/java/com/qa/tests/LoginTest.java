package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.utilities.waitUtility;
import com.qa.utilities.ScreenshotUtils;
import com.qa.utilities.JSONReader;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() throws InterruptedException {

        LoginPage loginPage =
                new LoginPage(driver);
      //  Thread.sleep(10000);
        
        JsonNode users;
		try {
			users = JSONReader.getUser("validUser");
		
        
        String username = users.get("username").asText();
        String password = users.get("password").asText();
        
        loginPage.enterUsername(username);

        loginPage.enterPassword(password);

        loginPage.clickLogin();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		Thread.sleep(5000);

		ScreenshotUtils.captureScreenshot(driver, "LoginTest");
        
        waitUtility.waitForUrlContains(driver, "dashboard");
        
        String currentUrl = driver.getCurrentUrl();
        
        Assert.assertTrue(currentUrl.contains("dashboardsd"));
        
        Thread.sleep(10000);
    }
}
