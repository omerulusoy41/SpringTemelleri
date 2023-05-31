package org.example.chp10;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new FileSystemXmlApplicationContext("C:\\Users\\Ömer Faruk\\OneDrive\\Masaüstü\\java project\\DependencyInjectionAndIOC\\src\\main\\java\\org\\example\\chp10\\config.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        ErrorOutputRenderer render = context.getBean("errorOutputRenderer", ErrorOutputRenderer.class);
        render.Render();
    }
}
