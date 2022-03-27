package com.stqa.driver;

import com.stqa.config.ConfigFactory;
import com.stqa.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

public static void initDriver(){
       WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://www.google.com");

}

public static void quitDriver(){

}
}
