package com.inheritance.hierarchicalinheritance.bankaccounttype;

public class CheckingAccount extends BankAccount{
	private double withdrawalLimit;
	CheckingAccount(long accountNumber,double balance,double withdrawalLimit){
		super(accountNumber,balance);
		this.withdrawalLimit = withdrawalLimit;
	}
	@Override
	void display(){
		super.display();
		System.out.println("Withdrawal limit of this account is :"+withdrawalLimit);
		System.out.println("Account type is Checking account");
		
	}
}
