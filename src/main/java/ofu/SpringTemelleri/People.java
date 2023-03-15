package ofu.SpringTemelleri;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:ofu/SpringTemelleri/people.properties")
public class People {
	
	@Value("Omer Faruk")
	private String name;
	@Value("${lastname}")
	private String lastname;
	@Value("${age}")
	private int age;
	@Override
	public String toString() {
		return "People [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
	
}
