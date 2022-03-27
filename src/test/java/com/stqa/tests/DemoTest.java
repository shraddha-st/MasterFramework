package com.stqa.tests;

import com.stqa.config.factory.BrowserStackConfigFactory;
import com.stqa.config.factory.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTest extends WebBase{
    // local, remote(selenium, selenoid, browserStack), : chrome, firefox

    @Test
    public void testLogin(){

//         System.out.println(ConfigFactory.getConfig().browser());
//        System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
    }
}
