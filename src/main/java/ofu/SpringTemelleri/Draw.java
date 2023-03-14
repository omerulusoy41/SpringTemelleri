package ofu.SpringTemelleri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Draw {
	
	@Qualifier("rectangle")
	@Autowired
	private Shape shape1;
	
	@Autowired
	private Shape triangle;
	
	@Autowired
	@Triang
	private Shape ownQualfier;
	
	public void draw()
	{
		shape1.draw();
		triangle.draw();
		ownQualfier.draw();
	}
}
	
