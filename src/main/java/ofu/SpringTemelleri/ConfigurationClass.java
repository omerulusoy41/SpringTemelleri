package ofu.SpringTemelleri;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

	@Bean("people")
	public People getPeople(String name,String lastname,int age) {
		return new People(name,lastname,age);
	}
	
	@Bean("name")
	public String getName() {
		return "OmerFaruk";
	}
	
	@Bean("lastname")
	public String getLastname() {
		return "Ulusoy";
	}
	
	@Bean("age")
	public int getAge() {
		return 20;
	}
	
}
