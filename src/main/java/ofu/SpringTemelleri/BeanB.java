package ofu.SpringTemelleri;

public class BeanB extends BeanA{
	
	protected float weight;
	
	
	@Override
	public String toString() {
		return "BeanB [weight=" + weight + ", name=" + name + ", age=" + age + "]";
	}


	public BeanB()
	{
		System.out.println("Ben BeanB");
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}
