package com.stqa.config.factory;

import com.stqa.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {
    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){

        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
