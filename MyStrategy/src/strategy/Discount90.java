package strategy;

public class Discount90 implements IDiscount {

	@Override
	public double doDiscount(double price) {
		return price * 0.9;
	}
	
}
