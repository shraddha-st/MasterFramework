package com.stqa.driver.factory.mobile.local;

import com.stqa.driver.manager.mobile.local.AndroidManager;
import com.stqa.driver.manager.mobile.local.IosManager;
import com.stqa.driver.manager.web.local.ChromeManager;
import com.stqa.driver.manager.web.local.IEManager;
import com.stqa.enums.BrowserType;
import com.stqa.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {

    private LocalMobileDriverFactory(){}

    // lamda expression
    private static final Map<MobilePlatformType, Supplier<WebDriver>>
    MAP = new EnumMap<>(MobilePlatformType.class);

     static {
        MAP.put(MobilePlatformType.ANDROID, AndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, IosManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatformType platformType) {
   return MAP.get(platformType).get();
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
