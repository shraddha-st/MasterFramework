package com.stqa.driver;

import com.stqa.config.factory.ConfigFactory;
import com.stqa.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.stqa.driver.factory.web.local.LocalDriverFactory;
import com.stqa.driver.factory.web.remote.RemoteDriverFactory;
import com.stqa.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import static com.stqa.config.factory.ConfigFactory.getConfig;

public class Driver {

public static void initDriver(){
       WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
//    WebDriver driver = RemoteDriverFactory.getDriver(getConfig().browserRemoteMode(), getConfig().browser());
//    WebDriver driver = LocalMobileDriverFactory.getDriver(MobilePlatformType.ANDROID);

    driver.get("https://www.google.com");
        driver.quit();
}

//public static void quitDriver(){
//
//}
}
