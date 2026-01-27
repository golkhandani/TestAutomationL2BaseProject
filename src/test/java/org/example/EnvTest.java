package org.example;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class EnvTest {


    @Test
    public void simpleTest() throws IOException {
        Properties props = new Properties();
        props.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
        String baseUrl = props.getProperty("base.url");
        System.out.println(baseUrl);
    }
}
