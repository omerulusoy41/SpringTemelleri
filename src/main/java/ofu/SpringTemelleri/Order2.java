package ofu.SpringTemelleri;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class Order2 implements OrderInterface{

	@Override
	public String toString() {
		return "Order2 []";
	}
}
