package com.qa.pages;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class actionsCodePage  {
    WebDriver driver;
    Actions actions;
    
    public actionsCodePage(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
	
	}
    
   
	
	By dragablelink	 = By.xpath("//h3[text()='Draggable']");
	By boxElement = By.id("drag-free");
	By boxElement2	= By.id("drag-x");
	By boxElement3	= By.id("drag-contained");
	
	public void clickOnDragableLink() {
		driver.findElement(dragablelink).click();
	}
	
	public void dragBoxElement() {
		WebElement box = driver.findElement(boxElement);
		actions.dragAndDropBy(box, 100, 200).perform();
		
		WebElement box1 = driver.findElement(boxElement2);
		actions.dragAndDropBy(box1, 500, 110).perform();
		
		
		
		String pos = driver.findElement(By.id("drag-position")).getText();
		Assert.assertTrue(pos.contains("drag-free"));
	}

	

	
	
	
	
}
