package com.stqa.config;

import com.stqa.enums.BrowserType;
import com.stqa.converters.StringToBrowserTypeConverter;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})

// local, remote(selenium, selenoid, browserStack), : chrome, firefox

public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

}
