package client;

import context.Ticket;
import strategy.Discount10;
import strategy.Discount50;
import strategy.Discount90;

public class AppMain {

	public static void main(String[] args) {
		//create new context
		Ticket ticket = new Ticket("t1", 100);
		System.out.println("New ticket: " + ticket);
		
		//set strategy
		ticket.setPatter(new Discount10());
		System.out.println("Discount10: " + ticket.getDiscountPrice());
		
		//set other strategy
		ticket.setPatter(new Discount50());
		System.out.println("Discount50: " + ticket.getDiscountPrice());

		//set other strategy
		ticket.setPatter(new Discount90());
		System.out.println("Discount90: " + ticket.getDiscountPrice());
	}

}
