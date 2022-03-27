package com.stqa.converters;

import com.stqa.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {

    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> stringBrowserTypeMap = Map.of
                ("CHROME", BrowserType.CHROME,
                "IE", BrowserType.IE);

return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
//        return BrowserType.valueOf(browserName.toUpperCase());
    }
}
