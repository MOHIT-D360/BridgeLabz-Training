package com.mybank;

public class CurrentAccount extends Account{
	private double intrestRate = 1.75;
	private String name;
	private double intrest;
	
	 CurrentAccount(int accountNumber,double balance,String name){
		 super(accountNumber,balance);
		 this.name = name;
		 this.intrest = 0;
		
	}
	 //for zero account
	CurrentAccount(int accountNumber,String name){
		super(accountNumber);
		this.name = name;
	}
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
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		intrest = super.balance* (intrestRate/100);
		return intrest;
	}
	String getName() {
		return name;
	}

}
