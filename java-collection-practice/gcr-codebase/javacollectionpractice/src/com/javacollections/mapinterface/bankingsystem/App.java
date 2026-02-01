package com.javacollections.mapinterface.bankingsystem;

public class App {
	public static void main(String[] args) {
		JavaMap bank = new JavaMap();
		
		bank.insert(new Account(101,5000.0));
		bank.insert(new Account(102,4000.0));
		bank.insert(new Account(103,6500.0));
		//sorted order
		bank.displaySorted();
		
		bank.withdrawalRequest(101, 250);
		bank.withdrawalRequest(102, 650);
		bank.withdrawalRequest(100, 500);
		
		bank.processWithdrawal();
		
		bank.displaySorted();
	
	}
}
