package ofu.SpringTemelleri;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("Allah")
public class People {
	
	private String name;
	private String lastname;
	private int age;

	public People() {
		System.out.println("People Constructor");
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
}
