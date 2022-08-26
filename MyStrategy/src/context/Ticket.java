package context;

import strategy.IDiscount;

public class Ticket {
	private String name;
	private double price;
	private IDiscount discount;
	
	public Ticket(String name, double price) {
		this.name = name;
		this.price = price;		
	}
	
	@Override
	public String toString() {
		return this.name + " - " + this.price + " - " + this.discount;
	}
	
	//important: frequently changing element
	public void setDiscount(IDiscount discount) {
		this.discount = discount;
	}
	
	public double getDiscountPrice() {
		return discount.doDiscount(price);
	}
	
	
}
