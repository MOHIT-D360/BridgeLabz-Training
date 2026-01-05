package com.mybank;

public class MyBank {
	public static void main(String [] args) {
		ITransaction c1 = new SavingsAccount(12345,6500.82,"Mohit");
		ITransaction c2 = new CurrentAccount(23456,7500.12,"Rohit");
		
		c1.checkBalance();
		c1.deposit(200.0);
		c1.withdraw(100);
		System.out.println("Intrest  :"+((SavingsAccount)c1).calculateInterest());
		c1.checkBalance();
		
		System.out.println("___________________________");
		
		c2.checkBalance();
		c2.deposit(200.0);
		c2.withdraw(100);
		System.out.println("Intrest  :"+((CurrentAccount)c2).calculateInterest());
		c2.checkBalance();
	}
	
}
