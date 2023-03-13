package ofu.SpringTemelleri;

public class BeanB extends BeanA{
	
	protected float weight;
	private BeanC beanc;
	
	public BeanB(BeanC beanc)
	{
		this.beanc=beanc;
		System.out.println("Ben BeanB");
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "BeanB [weight=" + weight + ", beanc=" + beanc + "]";
	}
	
	
}
