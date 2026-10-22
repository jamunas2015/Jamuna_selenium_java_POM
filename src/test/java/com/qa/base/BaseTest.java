package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.utilities.ConfigReader;

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
		
		String url = ConfigReader.getProperty("actions_url");
		driver.get(url);
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
}
