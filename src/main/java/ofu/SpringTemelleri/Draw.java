package ofu.SpringTemelleri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Draw {
	@Autowired
	private Shape shape;
	
	public void draw()
	{
		shape.draw();
	}
}
	
