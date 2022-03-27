package com.stqa.driver.factory.mobile.remote;

import com.stqa.driver.factory.web.remote.BrowserStackFactory;
import com.stqa.driver.factory.web.remote.SeleniumGridFactory;
import com.stqa.driver.factory.web.remote.SelenoidFactory;
import com.stqa.enums.BrowserRemoteModeType;
import com.stqa.enums.BrowserType;
import com.stqa.enums.MobilePlatformType;
import com.stqa.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory(){}

    // lamda test
    private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP =
            new EnumMap<>(MobileRemoteModeType.class);

    static {
//         MAP.put(MobileRemoteModeType.SAUCE_LABS, SelenoidFactory::getDriver);
        MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileFactory::getDriver);

    }

    public static WebDriver getDriver(MobileRemoteModeType browserRemoteModeType, MobilePlatformType platformType) {
    return MAP.get(browserRemoteModeType).apply(platformType);
    }

        /*public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){

        if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM){
        return SeleniumGridFactory.getDriver(browserType);

        } else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID){
         return  SelenoidFactory.getDriver(browserType);
        }else if(browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK){
        return  BrowserStackFactory.getDriver(browserType);
        }

return null;

    }*/
}
