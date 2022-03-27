package com.stqa.driver.manager.mobile.remote;

import com.stqa.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackIosManager {
    private BrowserStackIosManager(){}

    public static RemoteWebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("os_version", "15");
        capabilities.setCapability("device", "iPhone 8");
        capabilities.setCapability("real_mobile", "true");
        capabilities.setCapability("browserstack.local", "false");
        capabilities.setCapability("browserstack.video", "false");

        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);

    }
}
