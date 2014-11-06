package com.h13.slg.config;

import com.h13.slg.core.exception.RequestFatalException;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by sunbo on 14-11-5.
 */
public class PropertiesConfiguration {

    private static PropertiesConfiguration config = null;
    private static Map<String, String> map = new HashMap<String, String>();

    private PropertiesConfiguration() {
    }

    public static PropertiesConfiguration getInstance() {
        if (config == null)
            config = new PropertiesConfiguration();
        return config;
    }

    public void addResource(String configPath) throws RequestFatalException {
        InputStream is = PropertiesConfiguration.class.getResourceAsStream(configPath);
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            throw new RequestFatalException("configPath=" + configPath, e);
        }

        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            map.put(key, properties.getProperty(key));
        }

    }

    public String getStringValue(String key) {
        return map.get(key);
    }


    public int getIntValue(String key) {
        return new Integer(map.get(key) + "");
    }
}
