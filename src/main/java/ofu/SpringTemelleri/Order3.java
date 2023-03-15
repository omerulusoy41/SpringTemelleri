package ofu.SpringTemelleri;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Order3 implements OrderInterface{

	@Override
	public String toString() {
		return "Order3 []";
	}
}
