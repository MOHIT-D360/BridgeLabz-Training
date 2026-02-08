package com.multithreading.bankingsystemwithmultipletransaction;

import java.time.LocalTime;

public class Transaction implements Runnable {
	String name;
	double ammount;
	BankAccount b1 ;
	
	Transaction(BankAccount b1,String name,double ammount){
		this.name=name;
		this.b1 = b1;
		this.ammount = ammount;
		
	}
	@Override
	public void run() {
		
		
		System.out.println("["+Thread.currentThread().getName() + "]"+ "Attempting to withdraw "+ ammount
				+ " at "+ LocalTime.now()
				);
			b1.withdraw(name, ammount);
		
	}
}
