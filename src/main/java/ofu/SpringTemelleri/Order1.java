package ofu.SpringTemelleri;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class Order1 implements OrderInterface{

	@Override
	public String toString() {
		return "Order1 []";
	}
	
}
