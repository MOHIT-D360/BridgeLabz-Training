package com.inheritance.hierarchicalinheritance.bankaccounttype;

public class TestAccount {
	
	public static void main(String [] args) {
		BankAccount[] b = new BankAccount[3];
		b[0] = new SavingAccount(166178,68000.98,3.75);
		b[1] = new CheckingAccount(166178,68000.98,5000.0);
		b[2] = new FixedDepositeAccount(166178,68000.98,7.10);
		
		for(BankAccount ba : b) {
			ba.display();
			System.out.println("__________________________________");
		}
		
	}
	
	
}
