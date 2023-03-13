package ofu.SpringTemelleri;

public class BeanA {
	
	protected String name;
	protected int age;
	
	public BeanA()
	{
		System.out.println("Ben BeanA");
	}

	@Override
	public String toString() {
		return "BeanA [name=" + name + ", age=" + age + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
