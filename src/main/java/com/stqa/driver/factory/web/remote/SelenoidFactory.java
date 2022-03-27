package com.stqa.driver.factory.web.remote;

import com.stqa.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.stqa.driver.manager.web.remote.selenium.SeleniumGridIEManager;
import com.stqa.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.stqa.driver.manager.web.remote.selenoid.SelenoidIEManager;
import com.stqa.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SelenoidFactory {
private SelenoidFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>>
            MAP = new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, SelenoidChromeManager::getDriver);
        MAP.put(BrowserType.IE, SelenoidIEManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }



    /*public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                ? SelenoidChromeManager.getDriver()
                : SelenoidIEManager.getDriver();

    }*/

    }
