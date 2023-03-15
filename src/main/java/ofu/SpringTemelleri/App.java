package ofu.SpringTemelleri;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        System.out.println("@Lazy(true) olmadan once aslinda contructordam sonra ayaga klakmistim");
        People people = context.getBean("people",People.class);
        System.out.println(people);
    }
}
