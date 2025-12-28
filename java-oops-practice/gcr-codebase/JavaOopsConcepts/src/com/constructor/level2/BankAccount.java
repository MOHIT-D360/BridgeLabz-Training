package com.constructor.level2;

public class BankAccount {
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	BankAccount (int accountNumber,String accountHolder,double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void checkBalance() {
		System.out.println("Current Balance :" +balance);
	}
	public void modifyBalance(double balance) {
		this.balance = balance;
		
	}
	
	

}
