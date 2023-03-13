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
        BeanC beanc1 = context.getBean("BeanC",BeanC.class);
        BeanC beanc2 = context.getBean("BeanC",BeanC.class);
        if (beanc1 == beanc2)
        	System.out.println("Ben singletonum");
        else 
        	System.out.println("Ben prototypeim");
//        System.out.println("lazy-init=true oldugundan beanA ve beanB cagirildiginda olustu");
//        System.out.println("Normalde context newlenirken olusacakti");
//    	BeanA beanA = (BeanA) context.getBean("BeanA");
//    	BeanB beanB = context.getBean("BeanB",BeanB.class);
//    	System.out.println(beanA);
//    	System.out.println(beanB);
    }
}
