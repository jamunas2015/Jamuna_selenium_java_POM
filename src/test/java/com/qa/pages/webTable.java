package com.qa.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class webTable {
	
	 WebDriver driver;

	    public webTable(WebDriver driver) {

	        this.driver = driver;
	    }
	    
	    
	    

	    By webtablepage = By.xpath("//h3[text()='Web Tables']");
	    
	    public void clickWebTablePage() {
	    	
	    	driver.findElement(webtablepage).click();
	    }
	    
	  //to add record
	    
	 /**   By addrecord = By.xpath("//button[@id='add-record']");
	    By fname = By.id("f-first");
	    By lname = By.xpath("//input[@data-testid='f-last']");
	    By email = By.id("f-email");
	    By age = By.id("f-age");
	    By department = By.id("f-dept");
	    By saveBtn = By.xpath("//button[@id='save-record']");
	     
	  
	   
	    
	    public void clickaddRecord() {
	    	driver.findElement(addrecord).click();
	    }
	     public void enterfname(String frstname) {
	    	 driver.findElement(fname).clear();
	    	 driver.findElement(fname).sendKeys(frstname);
	     }
	     
	     public void enterlname(String lstname) {
	    	 driver.findElement(lname).clear();
	    	 driver.findElement(lname).sendKeys(lstname);
	     }
	     public void enteremail(String emailid) {
	    	 driver.findElement(email).clear();
	    	 driver.findElement(email).sendKeys(emailid);
	     }
	     
	     public void enterage(int agevalue) {
	    	 driver.findElement(age).clear();
	    	 driver.findElement(age).sendKeys(String.valueOf(agevalue));
	     }
	     
	     public void enterdepartment(String dept) {
	    	 driver.findElement(department).clear();
	    	 driver.findElement(department).sendKeys(dept);
	     }
	     
	     public void clicksaveBtn() {
	    	 driver.findElement(saveBtn).click();
	     }
	     **/
	    
	    // retrive table data by entering options
	    
	    By srchbox = By.xpath("//input[@placeholder='Search by any field']");
	    
	    By tabledata = By.xpath("//tr[td[text()='QA']]");
	    
	    By ediBtn = By.xpath("//td[text()='QA']/following-sibling::td//button[text()='Edit']");
	  
	    By cancelBtn = By.id("cancel-record");   
	    
	    public void enterSearchText(String searchText) {
	    	driver.findElement(srchbox).clear();
	    	driver.findElement(srchbox).sendKeys(searchText);
	    }
	    
	    public void retriveTableData() {
	    	String data = driver.findElement(tabledata).getText();
	    	
	    	List<WebElement> details = driver.findElements(tabledata);
	    	for (WebElement detail : details) {
	    		System.out.println("Row Data: " + detail.getText());
	    	}
	    }
	    
	   public void clickEditBtn() {
	    	driver.findElement(ediBtn).click();
	    
	    }
	    
	   public void clickCancelBtn() {
	    	driver.findElement(cancelBtn).click();
	    }
}


