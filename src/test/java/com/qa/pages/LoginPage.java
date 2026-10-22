package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    By txtUserName = By.name("username");

    By txtPassword = By.name("password");
    

    By btnLogin = By.xpath("//button[@type='submit']");

    public void enterUsername(String username) {

        driver.findElement(txtUserName).sendKeys(username);
    }

    public void enterPassword(String password) {

        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickLogin() {

        driver.findElement(btnLogin).click();
    }
}