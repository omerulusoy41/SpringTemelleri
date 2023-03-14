package ofu.SpringTemelleri;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

	public void draw() {
		System.out.println("Triangle ile cizildi");	
	}

}
