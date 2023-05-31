package ofu.SpringTemelleri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
@ComponentScan
public class App 
{
	@Autowired
	public List<OrderInterface> allOrder;
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        App app = context.getBean("app",App.class);
        for (OrderInterface order: app.allOrder) {
        	System.out.println(order);
        }
    }
}
