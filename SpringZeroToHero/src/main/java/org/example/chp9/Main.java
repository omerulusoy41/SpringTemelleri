package org.example.chp9;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("C:\\Users\\Ömer Faruk\\OneDrive\\Masaüstü\\java project\\DependencyInjectionAndIOC\\src\\main\\java\\org\\example\\chp9\\config.xml");
        ErrorOutputRenderer render = context.getBean("render",ErrorOutputRenderer.class);
        render.Render();
    }
}
