package com.stqa.driver.factory.web.remote;

import com.stqa.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.stqa.driver.manager.web.remote.browserstack.BrowserStackIEManager;
import com.stqa.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.stqa.driver.manager.web.remote.selenium.SeleniumGridIEManager;
import com.stqa.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>>
            MAP = new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, SeleniumGridChromeManager::getDriver);
        MAP.put(BrowserType.IE, SeleniumGridIEManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }


   /* public static WebDriver getDriver(BrowserType browserType){

        return browserType == BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridIEManager.getDriver();
    }*/
}
