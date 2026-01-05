package com.ewalletapplication;

public class User {
	private String name;
	private Wallet wallet;
	
	User(String name,Wallet wallet){
		this.name = name;
		this.wallet = wallet;
		wallet.setOwner(this);
		
	}
	public Wallet getWallet() {
		return wallet;
	}
	
	public void showBalance() {
		System.out.println(name+ " Balance: "+ wallet.getBalance());
	}
	public String getName() {
		return name;
	}
	
	public void showTransactionHistory() {
		System.out.println("Transaction History of "+ name);
		wallet.showTransactions();
	}
	
}

