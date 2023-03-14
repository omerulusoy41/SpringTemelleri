package ofu.SpringTemelleri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ofu/SpringTemelleri/config.xml");
        BeanA beana = context.getBean("beanA",BeanA.class);
        System.out.println(beana);
    }
}
