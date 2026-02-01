package com.javacollections.mapinterface.bankingsystem;

public class Account implements Comparable<Account> {
	
	
	

	

	public Double balance1;

//	public int accountNumber1;

	public Integer accountNumber1;
	
	Account(Integer accountNumber,Double balance){
		this.accountNumber1 = accountNumber;
		this.balance1  = balance;
	}
	
	
	public int compareTo(Account other) {
		return Double.compare(other.balance1, this.balance1);
	}
}
