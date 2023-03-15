package ofu.SpringTemelleri;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(true)
public class People {
	
	private String name;
	@Value("Ulusoy")
	private String lastname;
	private int age;

	public People() {
		System.out.println("Constructor");
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
}
