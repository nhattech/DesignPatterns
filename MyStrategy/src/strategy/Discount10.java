package strategy;

public class Discount10 implements IPattern{

	@Override
	public double doDiscount(double price) {
		return price * 0.1;
	}
	
	
	

}
