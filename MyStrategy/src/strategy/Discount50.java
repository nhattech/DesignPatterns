package strategy;

public class Discount50 implements IDiscount{

	@Override
	public double doDiscount(double price) {
		
		return price * 0.5;
	}
	
}
