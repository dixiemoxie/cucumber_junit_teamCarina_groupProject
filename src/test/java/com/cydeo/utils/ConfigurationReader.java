package com.cydeo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private ConfigurationReader() {}


    private static Properties properties = new Properties();

    static {

        try {

            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

       return properties.getProperty(key);
    }


}
