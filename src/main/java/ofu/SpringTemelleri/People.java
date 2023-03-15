package ofu.SpringTemelleri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class People {
	
	private String name;
	@Value("Ulusoy")
	private String lastname;
	private int age;

	@Override
	public String toString() {
		return "People [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	@Autowired
	public void setName(@Qualifier("name") String name) {
		this.name = name;
	}


	@Autowired
	public void setAge(int age) {
		this.age = age;
	}

	@Bean("name")
	public  String setName() {
		return "Omer";
	}
	
	@Bean("lastname")
	public  String setLastName() {
		return "Ulusoy";
	}
	
	
	@Bean ("age")
	public  int setAge() {
		return 20;
	}
	
	
	
}
