package ofu.SpringTemelleri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context1 = new FileSystemXmlApplicationContext("C:\\Users\\Ömer Faruk\\eclipse-workspace\\SpringTemelleri\\src\\main\\java\\ofu\\SpringTemelleri\\config.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("ofu/SpringTemelleri/config.xml");
    	BeanA beanA = (BeanA) context1.getBean("BeanA");
    	BeanB beanB = context2.getBean("BeanB",BeanB.class);
    	System.out.println("Her context kendi beanlerini yonetir");
        
    }
}
