package com.mybank;

public abstract  class Account implements ITransaction{
	protected int accountNumber;
	protected double balance;
	
	Account(int accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	Account(int accountNumber){
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	@Override
	public void deposit(double amount) {
		if(amount>=0) {
			balance += amount;
			System.out.println("successfully deposited...");
		}
	}
	public void withdraw(double amount) {
		if(amount<=balance&& balance != 0) {
			balance -= amount;
			System.out.println("Successfully withdraw...");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void checkBalance () {
		System.out.println("Balace :"+balance);
	}
	
	abstract double calculateInterest();
	
	
	
	
	
}
