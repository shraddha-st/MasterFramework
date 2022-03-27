package com.stqa.driver;

import com.stqa.config.ConfigFactory;
import com.stqa.driver.manager.ChromeManager;
import com.stqa.driver.manager.IEManager;
import com.stqa.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver = null;
        if(ConfigFactory.getConfig().browser() == BrowserType.CHROME) driver = ChromeManager.getDriver();
        else driver = IEManager.getDriver();

    return driver;
    }

}
