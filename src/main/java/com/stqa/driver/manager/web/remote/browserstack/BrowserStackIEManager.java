package com.stqa.driver.manager.web.remote.browserstack;

import com.stqa.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackIEManager {

    private BrowserStackIEManager(){}

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("browserName","ie");
        capabilities.setCapability("browser_version", "Latest");
        capabilities.setCapability("os", "windows");
        capabilities.setCapability("os_version", "7");

        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig()
                .browserStackURL(), capabilities);


    }
}
