package com.inheritance.hierarchicalinheritance.bankaccounttype;

public class BankAccount {
	protected long accountNumber ;
	protected double balance;
	
	BankAccount(long accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	void display() {
		System.out.println("Account number      :"+ accountNumber);
		System.out.println("Balance             :"+ balance);
	}
}
