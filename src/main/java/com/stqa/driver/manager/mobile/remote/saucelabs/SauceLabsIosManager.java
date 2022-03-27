package com.stqa.driver.manager.mobile.remote.saucelabs;

import com.stqa.config.factory.BrowserStackConfigFactory;
import com.stqa.config.factory.SauceLabsConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SauceLabsIosManager {
    private SauceLabsIosManager(){}

    public static RemoteWebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("appium:platformVersion", "15.0");
        capabilities.setCapability("appium:deviceName", "iPhone .*");
        capabilities.setCapability("appium:orientation", "portrait");
        capabilities.setCapability("appium:app", "storage:filename=<file-name>");
        DesiredCapabilities sauceOptions = new DesiredCapabilities();
        sauceOptions.setCapability("username", SauceLabsConfigFactory.getConfig().userName());
        sauceOptions.setCapability("accessKey", SauceLabsConfigFactory.getConfig().key());
        capabilities.setCapability("sauce:options", sauceOptions);
        return new RemoteWebDriver(SauceLabsConfigFactory.getConfig()
                .sauceLabsURL(), capabilities);
    }
}
