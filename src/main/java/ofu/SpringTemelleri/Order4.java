package ofu.SpringTemelleri;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Order4 implements OrderInterface{

	@Override
	public String toString() {
		return "Order4 []";
	}
}
