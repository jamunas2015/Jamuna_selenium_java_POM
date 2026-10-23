package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.utilities.ConfigReader;
import com.qa.utilities.ScreenshotUtils;

public class BaseTest {

	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

		// driver.get("https://opensource-demo.orangehrmlive.com/");

		// webtable link

		// driver.get("https://jstestingacademy.co.in/qa-demo/elements/");
		// actions link
		
		String url = ConfigReader.getProperty("orangehrm_url");
		driver.get(url);
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

	    if (result.getStatus() == ITestResult.FAILURE) {

	        ScreenshotUtils.captureScreenshot(
	                driver,
	                result.getName());
	    }

	    driver.quit();
	}
	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
	
}
