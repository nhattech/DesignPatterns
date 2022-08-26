package strategy;

public class Discount50 implements IPattern{

	@Override
	public double doDiscount(double price) {
		
		return price * 0.5;
	}
	
}
