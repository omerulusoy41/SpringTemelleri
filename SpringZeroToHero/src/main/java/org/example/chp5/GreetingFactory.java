package org.example.chp5;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

public class GreetingFactory implements Factory{
    private static GreetingFactory instance;
    private static Properties props;

    static {
        instance = new GreetingFactory();
    }

    public static  GreetingFactory getInstance() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream =
                    new FileInputStream("C:\\Users\\Ömer Faruk\\Desktop\\java project\\DependencyInjectionAndIOC\\src\\main\\java\\org\\example\\chp5\\application.properties");
            props = new Properties();
            props.load(fileInputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return instance;
    }

    @Override
    public Provider getProvider() {
        Provider instance;
        try {
            Class<?> clazz = Class.forName(props.getProperty("provider"));
            instance = (Provider) clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return instance;
    }

    @Override
    public Renderer getRender() {
        Renderer instance;
        try {
            Class<?> clazz = Class.forName(props.getProperty("renderer"));
             instance = (Renderer) clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return instance;
    }
}
