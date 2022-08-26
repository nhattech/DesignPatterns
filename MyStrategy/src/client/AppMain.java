package client;

import java.util.Random;

import context.Ticket;
import strategy.Discount10;
import strategy.Discount50;
import strategy.Discount90;
import strategy.IDiscount;

public class AppMain {

	public static void main(String[] args) {
		// create new context
		Ticket ticket = new Ticket("New ticket", 100);
		System.out.println(ticket);

		
		IDiscount discount;
		Random rd = new Random();
		for (int i = 1; i <= 5; i++) {
			int strategyIndex = rd.nextInt(3);
			
			//Random discount
			switch (strategyIndex) {
			case 0:
				discount = new Discount10();
				break;
			case 1:
				discount = new Discount50();
				break;
			default:
				discount = new Discount90();
				break;
			}
			
			// set other strategy: discount
			ticket.setDiscount(discount);
			
			System.out.println(discount.getClass().getSimpleName() + ": " + 
			ticket.getDiscountPrice());
		}
	}

}
