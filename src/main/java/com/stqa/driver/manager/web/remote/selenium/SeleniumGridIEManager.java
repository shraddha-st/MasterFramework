package com.stqa.driver.manager.web.remote.selenium;

import com.stqa.config.factory.ConfigFactory;
import com.stqa.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridIEManager {
    private SeleniumGridIEManager(){}

    public static WebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(BrowserType.IE));
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);

    }
}
