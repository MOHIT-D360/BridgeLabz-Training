package com.functionalinterfaces.paymentgatewayintegration;

interface PaymentProcessor {
	   void pay(double amount);

	    
	    default void refund(double amount) {
	        System.out.println("Refund of " + amount + " processed (default)");
	    }
}
