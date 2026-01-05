package com.ewalletapplication;
import java.util.ArrayList;

public class Wallet implements Transferrable{
	private double balance;
	private ArrayList<Transaction> history = new ArrayList<>();
	
	
	
	Wallet(double balance){
		this.balance = balance;
		
	}
	public double getBalance() {
		return balance;
	}
	public void transferTo(User receiver,double amount) {
		if(amount<= balance) {
			balance -=amount;
			receiver.getWallet().credit(amount);
			System.out.println("Transfer Successful");
			
			Transaction tx = new Transaction(
					this.getOwner(), receiver,amount
					);
			history.add(tx);
		}
		else {
			System.out.println("Transfer Successful");
		}
	}
	protected void credit(double amount) {
		balance+= amount;
	}
	
	public void showTransactions() {
		for(Transaction t : history) {
			System.out.println(t.getDetails());
		}
	}
	
	private User owner;
	void setOwner(User user) {
		this.owner = user;
	}
	User getOwner() {
		return owner;
	}
}
