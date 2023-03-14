package ofu.SpringTemelleri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "Deneme");
        ApplicationContext context = new ClassPathXmlApplicationContext("ofu/SpringTemelleri/config.xml");
        People people = context.getBean("people",People.class);
        System.out.println(people);
    }
}
