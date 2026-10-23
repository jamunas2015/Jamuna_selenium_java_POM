package com.qa.listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.utilities.ExtentManager;
import com.qa.utilities.ScreenshotUtils;

public class ExtentListener implements org.testng.ITestListener {

	ExtentReports extent = ExtentManager.getReportObject();
    ExtentTest test;
    WebDriver driver;

    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
    	String path = ScreenshotUtils.captureScreenshot(
    	        driver,
    	        result.getName());

    	test.addScreenCaptureFromPath(path);

        test.fail(result.getThrowable());
    }

    public void onFinish(
       org.testng.ITestContext context) {

        extent.flush();
    }
	
}
