package com.stqa.driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public final class IEManager {
    private IEManager(){}

    public static WebDriver getDriver(){

        WebDriverManager.iedriver().setup();

        return new InternetExplorerDriver();
    }
}
