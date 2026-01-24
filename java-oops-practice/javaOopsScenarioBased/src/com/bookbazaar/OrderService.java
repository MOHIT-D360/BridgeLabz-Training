package com.bookbazaar;

public class OrderService {
	 public void checkout(Order order) {

	        if (order.getStatus() != OrderStatus.CREATED) {
	            System.out.println(" Order already processed");
	            return;
	        }

	        double total = order.calculateTotal();
	        order.markPaid();

	        System.out.println(" Order Paid Successfully");
	        System.out.println("Total Amount: ₹" + total);
	    }
}
