package ofu.SpringTemelleri;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class People {
	
	private String name;
	private String lastname;
	private int age;
	
	public People(String name, String lastname, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		System.out.println("olustum");
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	@Bean("name")
	public static String setName() {
		return "Omer";
	}
	
	@Bean ("lastname")
	public static String setLastname() {
		return "ulusoy";
	}
	
	@Bean ("age")
	public static int setAge() {
		return 20;
	}
	
	
	
}
