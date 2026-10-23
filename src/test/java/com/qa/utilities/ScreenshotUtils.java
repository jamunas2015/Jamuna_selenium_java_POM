package com.qa.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	 public static String captureScreenshot(WebDriver driver, String testName) {

	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
	                .format(new Date());

	        String screenshotPath = System.getProperty("user.dir")
	                + "/Screenshots/"
	                + testName + "_" + timestamp + ".png";

	        try {

	            File srcFile = ((TakesScreenshot) driver)
	                    .getScreenshotAs(OutputType.FILE);

	            FileUtils.copyFile(srcFile, new File(screenshotPath));

	            System.out.println("Screenshot saved: " + screenshotPath);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return screenshotPath;
	    }

}
