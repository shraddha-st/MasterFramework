package com.stqa.tests;

import com.stqa.driver.Driver;
import org.testng.annotations.BeforeMethod;

public class WebBase {

    @BeforeMethod
    public void setUp(){
        Driver.initDriver();
    }
}
