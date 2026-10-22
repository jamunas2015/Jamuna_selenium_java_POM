package com.qa.tests;


import org.testng.annotations.Test;
import com.qa.base.BaseTest;
import com.qa.pages.actionsCodePage;
import com.qa.pages.webTable;
import com.qa.utilities.waitUtility;
import org.testng.Assert;
import org.openqa.selenium.By;
import java.time.Duration;



public class actionCodeTest extends BaseTest {

	@Test
	public void verifyActionCodeTest() throws InterruptedException {

		actionsCodePage actionsCodeTest = new actionsCodePage(driver);
		
		waitUtility.waitForUrlContains(driver, "elements");
		
		
}
	
}

