package com.inheritance.hierarchicalinheritance.bankaccounttype;

public class FixedDepositeAccount extends BankAccount{
	private double intrestRate;
	FixedDepositeAccount(long accountNumber,double balance,double intrestRate){
		super(accountNumber,balance);
		this.intrestRate = intrestRate;
		
	}
	@Override
	void display() {
		super.display();
		System.out.println("Intrest Rate :"+intrestRate);
		System.out.println("Account type is Fixed Deposite account");
	}
}
