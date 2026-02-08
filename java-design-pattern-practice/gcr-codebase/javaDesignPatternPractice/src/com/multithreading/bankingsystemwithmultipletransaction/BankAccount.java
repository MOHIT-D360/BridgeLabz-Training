package com.multithreading.bankingsystemwithmultipletransaction;

public class BankAccount {
	private double balance;
	
	BankAccount(){
		balance = 10000;
	}
	public synchronized double getBalance() {
		
		return balance;
	}
	public synchronized void withdraw(String customer,double ammount) {
		if(balance>=ammount) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			balance -=ammount;
			System.out.println("Transaction Success :"+ customer+ " amount "+ammount + " Remaining balance :"+balance);
			
		}
		else {
			System.out.println("Failed");
		}
	}
}
