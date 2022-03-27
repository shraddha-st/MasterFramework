package com.stqa.driver.manager.web.remote.selenoid;

import com.stqa.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelenoidIEManager {
    public static WebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("browserName","ie");
//        capabilities.setCapability("", "91.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);


        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidGridURL(), capabilities);


    }
}
