package com.inheritance.hierarchicalinheritance.bankaccounttype;

public class SavingAccount  extends BankAccount{
	private double interestRate;
	SavingAccount(long accountNumber,double balance,double interestRate){
		super(accountNumber,balance);
		this.interestRate =interestRate;
	}
	
	void display(){
		super.display();
		System.out.println("Interest Rate is   : 3.75% and account type is Saving account");
	}
}
