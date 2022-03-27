package com.stqa.driver.factory.mobile.remote;

import com.stqa.driver.manager.mobile.remote.BrowserStackAndroidManager;
import com.stqa.driver.manager.mobile.remote.BrowserStackIosManager;
import com.stqa.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.stqa.driver.manager.web.remote.browserstack.BrowserStackIEManager;
import com.stqa.enums.BrowserType;
import com.stqa.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackMobileFactory {

    private BrowserStackMobileFactory(){}

    private static final Map<MobilePlatformType, Supplier<WebDriver>>
            MAP = new EnumMap<>(MobilePlatformType.class);

    static {
        MAP.put(MobilePlatformType.ANDROID, BrowserStackAndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, BrowserStackIosManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilePlatformType).get();
    }

    /*public static WebDriver getDriver(BrowserType browserType){

        return browserType == BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackIEManager.getDriver();


    }*/
}
