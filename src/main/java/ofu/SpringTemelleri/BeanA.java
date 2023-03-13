package ofu.SpringTemelleri;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {
	
	protected String name;
	protected int age;
	@Autowired
	protected BeanB beanb;
	
	public BeanA() {
		System.out.println("Ben BeanA");
	}
	
//	@Autowired
	public BeanA(BeanB beanb)
	{
		System.out.println("argconstructor");
		this.beanb = beanb;
	}

//	@Autowired
	public void setBeanB(BeanB beanb)
	{
		System.out.println("setter");
		this.beanb = beanb;
	}


	@Override
	public String toString() {
		return "BeanA [name=" + name + ", age=" + age + ", beanb=" + beanb + "]";
	}



	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
