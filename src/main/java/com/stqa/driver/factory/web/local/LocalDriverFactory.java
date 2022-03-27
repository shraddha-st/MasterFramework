package com.stqa.driver.factory.web.local;

import com.stqa.driver.manager.web.local.ChromeManager;
import com.stqa.driver.manager.web.local.IEManager;
import com.stqa.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    // lamda expression
    private static final Map<BrowserType, Supplier<WebDriver>>
    MAP = new EnumMap<>(BrowserType.class);

     static {
        MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
        MAP.put(BrowserType.IE, IEManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
   return MAP.get(browserType).get();
    }


/*    public static WebDriver getDriver(BrowserType browserType){

        return isBrowserName(browserType)
                ? ChromeManager.getDriver()
                : IEManager.getDriver();
    }

    public static boolean isBrowserName(BrowserType browserType) {
        return browserType == BrowserType.CHROME;
    }*/
}
