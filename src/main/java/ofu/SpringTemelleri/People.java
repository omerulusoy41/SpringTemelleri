package ofu.SpringTemelleri;

public class People {
	
	private String name;
	private String lastname;
	private int age;
	
	public People() {
		
	}
	
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
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
