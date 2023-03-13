package ofu.SpringTemelleri;

public class BeanB extends BeanA{
	
	protected float weight;
	private BeanC beanc;
	
	public BeanB()
	{
		System.out.println("Ben BeanB");
	}
	
	public void setBeanC(BeanC beanc)
	{
		this.beanc = beanc;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "BeanB [weight=" + weight + ", beanc=" + beanc + "]";
	}
	
	
}
