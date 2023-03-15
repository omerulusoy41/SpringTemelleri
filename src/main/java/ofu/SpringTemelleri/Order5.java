package ofu.SpringTemelleri;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Order5 implements OrderInterface{

	@Override
	public String toString() {
		return "Order5 []";
	}
}
