package ofu.SpringTemelleri;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{
	
	public void draw() {
		System.out.println("Rectangle ile cizildi");
	}
}
