package com.stqa.driver.manager.mobile.remote.saucelabs;

import com.stqa.config.factory.BrowserStackConfigFactory;
import com.stqa.config.factory.SauceLabsConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SauceLabsAndroidManager {
   private SauceLabsAndroidManager(){}


    public static WebDriver getDriver() {
        //dummy code and not tested
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "11");
        capabilities.setCapability("appium:deviceName", "Samsung.*Galaxy.*");
        capabilities.setCapability("appium:orientation", "portrait");
        capabilities.setCapability("appium:app", "storage:filename=<file-name>");
        DesiredCapabilities sauceOptions = new DesiredCapabilities();
        sauceOptions.setCapability("username", SauceLabsConfigFactory.getConfig().userName());
        sauceOptions.setCapability("accessKey", SauceLabsConfigFactory.getConfig().key());
        capabilities.setCapability("sauce:options", sauceOptions);
        return new RemoteWebDriver(SauceLabsConfigFactory.getConfig()
                .sauceLabsURL(), capabilities); }
}
