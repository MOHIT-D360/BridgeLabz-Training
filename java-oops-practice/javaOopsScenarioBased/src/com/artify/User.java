package com.artify;

public class User {
	public String name;
	private double walletBalance;
	
	User(String name,double walletBalance){
		this.name = name;
		this.walletBalance = walletBalance;
		
	}
	
	public double getBalance() {
		return walletBalance;
		
	}
	public void setBalance(double balance) {
		this.walletBalance = balance;
	}
	
	
}
