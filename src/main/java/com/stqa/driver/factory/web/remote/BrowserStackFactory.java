package com.stqa.driver.factory.web.remote;

import com.stqa.driver.manager.web.local.ChromeManager;
import com.stqa.driver.manager.web.local.IEManager;
import com.stqa.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.stqa.driver.manager.web.remote.browserstack.BrowserStackIEManager;
import com.stqa.enums.BrowserRemoteModeType;
import com.stqa.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {

    private BrowserStackFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>>
            MAP = new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, BrowserStackChromeManager::getDriver);
        MAP.put(BrowserType.IE, BrowserStackIEManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }

    /*public static WebDriver getDriver(BrowserType browserType){

        return browserType == BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackIEManager.getDriver();


    }*/
}
