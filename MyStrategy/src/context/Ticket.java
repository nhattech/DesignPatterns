package context;

import strategy.IPattern;

public class Ticket {
	private String name;
	private double price;
	private IPattern pattern;
	
	public Ticket(String name, double price) {
		this.name = name;
		this.price = price;		
	}
	
	@Override
	public String toString() {
		return this.name + " - " + this.price + " - " + this.pattern;
	}
	
	//important: frequently changing element
	public void setPatter(IPattern pattern) {
		this.pattern = pattern;
	}
	
	public double getDiscountPrice() {
		return pattern.doDiscount(price);
	}
	
	
}
