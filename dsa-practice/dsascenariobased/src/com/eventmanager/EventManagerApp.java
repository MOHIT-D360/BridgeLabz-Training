package com.eventmanager;

public class EventManagerApp {
	  public static void main(String[] args) {

	        Ticket[] tickets = {
	            new Ticket(1200),
	            new Ticket(500),
	            new Ticket(3000),
	            new Ticket(800),
	            new Ticket(150),
	            new Ticket(2000)
	        };

	        Sort.quickSort(tickets, 0, tickets.length - 1);

	        System.out.println("Cheapest Tickets:");
	        for (int i = 0; i < 3; i++) {
	            System.out.println("₹" + tickets[i].price);
	        }

	        System.out.println("\nMost Expensive Tickets:");
	        for (int i = tickets.length - 1; i >= tickets.length - 3; i--) {
	            System.out.println("₹" + tickets[i].price);
	        }
	    }
}
