package com.ewalletapplication;

public class Transaction {
	private User from ;
	private User to ;
	private double amount;
	
	Transaction(User from , User to ,double amount){
		this.from = from ;
		this.to = to ;
		this.amount = amount;
	}
	
	public String getDetails() {
		return from.getName() + " sent "+ amount + " to "+ to.getName();
	}
}
