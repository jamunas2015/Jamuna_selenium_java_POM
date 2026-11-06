package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.utilities.ConfigReader;
import com.qa.utilities.ScreenshotUtils;

public class BaseTest {

	public WebDriver driver;

	@BeforeMethod
	
	public void setup() {

		//driver = new ChromeDriver();
		String browser = ConfigReader.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless=new");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");

			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			// Initialize Firefox driver
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			// Initialize Edge driver
			driver = new EdgeDriver();
		} else {
			throw new IllegalArgumentException("Invalid browser specified in config.properties");
		}
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

		
		
		String url = ConfigReader.getProperty("orangehrm_url");
		driver.get(url);
	}

	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
	
}
