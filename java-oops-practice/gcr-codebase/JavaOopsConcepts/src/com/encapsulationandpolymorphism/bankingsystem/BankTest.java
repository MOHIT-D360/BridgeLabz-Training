package com.encapsulationandpolymorphism.bankingsystem;

public class BankTest {

	public static void main(String[] args) {
		BankAccount[] b = new BankAccount[2];
		
		b[0] = new SavingsAccount(123499085,"Mohit",3000000);
		b[1] = new CurrentAccount(12942021,"Rohan", 5000);
		
		for(BankAccount bb : b) {
			System.out.println("Name   :"+bb.getName());
			System.out.println("Balance   :"+bb.getBalance());
			
			System.out.println("Intrest on current balance :"+bb.calculateInterest());
			
			
			
			if(bb instanceof Loanable) {
				((Loanable) bb).applyForLoan();
			}
			
		}

	}

}
