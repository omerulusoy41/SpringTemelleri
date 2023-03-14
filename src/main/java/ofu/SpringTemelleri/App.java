package ofu.SpringTemelleri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ofu/SpringTemelleri/config.xml");
        People people1 = context.getBean("people",People.class);
        People people2 = context.getBean("people",People.class);
        if (people1 == people2)
        	System.out.println("Im a singleton");
        else 
        	System.out.println("Im a prototype");
    }
}
