package com.stqa.tests;

import com.stqa.config.ConfigFactory;
import com.stqa.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
    // local, remote(selenium, selenoid, browserStack), : chrome, firefox

    @Test
    public void testLogin(){

         System.out.println(ConfigFactory.getConfig().browser());

    }
}
