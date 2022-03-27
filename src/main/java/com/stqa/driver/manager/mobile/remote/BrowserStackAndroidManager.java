package com.stqa.driver.manager.mobile.remote;

import com.stqa.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackAndroidManager {
   private BrowserStackAndroidManager(){}


    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("os_version", "7.1");
        capabilities.setCapability("device", "Samsung Galaxy Note 8");
        capabilities.setCapability("real_mobile", "true");
        capabilities.setCapability("browserstack.local", "false");
        capabilities.setCapability("browserstack.video", "false");
        capabilities.setCapability("browser", "chrome");


        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
    }
}
