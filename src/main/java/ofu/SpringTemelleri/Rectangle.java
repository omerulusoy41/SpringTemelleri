package ofu.SpringTemelleri;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Rectangle implements Shape{
	
	public void draw() {
		System.out.println("Rectangle ile cizildi");
	}
}
