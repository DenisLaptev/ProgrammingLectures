package com.kov.lectures.lecture_6_IO.item_8;

import java.io.*;
import java.util.Properties;

/**
 * Created by Kovantonlenko on 12/1/2015.
 */
public class PropertiesWorker {
    public static void main(String[] args) throws IOException {

        String properies = "src\\main\\java\\com\\kov\\lectures\\lecture_6_IO\\item_8\\example.properties";
        String newproperies = "src\\main\\java\\com\\kov\\lectures\\lecture_6_IO\\item_8\\newexample.properties";

        readProperties(properies);
        writeProperties(newproperies);
    }

    public static void writeProperties(String path) throws IOException {
        Properties prop = new Properties();
        OutputStream out = new FileOutputStream(new File(path));

        prop.setProperty("key1", "value1000000");
        prop.setProperty("key2", "value2000000");

        prop.store(out, "my comment");

    }

    public static void readProperties(String path) throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream(new File(path));

        prop.load(input);

        String key1 = prop.getProperty("key1");
        String key2 = prop.getProperty("key2");

        System.out.println(key1);
        System.out.println(key2);
    }
}
