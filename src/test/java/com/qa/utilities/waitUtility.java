package com.qa.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUtility {

    public static void waitForUrlContains(WebDriver driver,
                                          String urlText) {

        WebDriverWait wait =
                new WebDriverWait(driver,
                                  Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlContains(urlText));
    }

    public static void waitForUrlToBe(WebDriver driver,
                                      String expectedUrl) {

        WebDriverWait wait =
                new WebDriverWait(driver,
                                  Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlToBe(expectedUrl));
    }
}
