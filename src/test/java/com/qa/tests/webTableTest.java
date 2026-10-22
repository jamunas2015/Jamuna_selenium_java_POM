package com.qa.tests;

import org.testng.annotations.Test;
import com.qa.base.BaseTest;
import com.qa.pages.webTable;
import com.qa.utilities.waitUtility;
import org.testng.Assert;
import org.openqa.selenium.By;
import java.time.Duration;

public class webTableTest extends BaseTest {

	@Test
	public void verifyWebTablePage() throws InterruptedException {

		webTable webTablePage = new webTable(driver);
		
		// Wait for the web table page to load
		waitUtility.waitForUrlContains(driver, "elements");
		
	/**	
		webTablePage.clickaddRecord();
		webTablePage.enterfname("John");
		webTablePage.enterlname("Doe");
		webTablePage.enteremail("johndoedummy@gmail.com");
		webTablePage.enterage(30);
		webTablePage.enterdepartment("IT");
		webTablePage.clicksaveBtn();  **/
		
		webTablePage.clickWebTablePage();
		webTablePage.enterSearchText("QA");
		webTablePage.retriveTableData();
		webTablePage.clickEditBtn();
		webTablePage.clickCancelBtn();
		
		
		// Verify that the web table page is displayed
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);
		
		Assert.assertTrue(currentUrl.contains("elements"));
		Thread.sleep(10000);
	}

	
	
	
}
