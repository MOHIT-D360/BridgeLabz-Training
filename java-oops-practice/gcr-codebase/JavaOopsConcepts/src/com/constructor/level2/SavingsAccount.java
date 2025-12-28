package com.constructor.level2;

public class SavingsAccount extends BankAccount{
	SavingsAccount(int accountNumber,String accountHolder,double balance){
		super(accountNumber,accountHolder,balance);
	}
	
	public void display() {
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Holder :"+accountHolder);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s1 = new SavingsAccount(22381028,"Mohit Dixit",77000.332);
		s1.display();
		s1.checkBalance();

	}

}
