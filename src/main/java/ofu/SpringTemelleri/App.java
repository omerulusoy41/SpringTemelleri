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
    	BeanA beanA = (BeanA) context.getBean("BeanA");
    	BeanB beanB = context.getBean("BeanB",BeanB.class);
    	System.out.println(beanA);
    	System.out.println(beanB);
    }
}
