package com.javacollections.mapinterface.bankingsystem;
import java.util.*;

public class JavaMap {
	Map<Integer,Double> hashmap = new HashMap<>();
	Map<Integer,Double> treemap = new TreeMap<>();
	Queue<Withdrawal> q1 = new LinkedList<>();
	

	

	
	public void insert(Account a) {
		hashmap.put(a.accountNumber1, a.balance1);
		treemap.put(a.accountNumber1, a.balance1);
	}
	
	
	

	
	void withdrawalRequest(int accountNumber,double balance) {
		q1.offer(new Withdrawal(accountNumber,balance));
	}
	
	void processWithdrawal() {
		while(!q1.isEmpty()) {
			Withdrawal withDrawalReq   = q1.poll();
			
			if(hashmap.containsKey(withDrawalReq.accountNumber)) {
				double ammount = hashmap.getOrDefault(withDrawalReq.accountNumber, 0.0);
				if(ammount>=withDrawalReq.balance) {
//					System.out.println(withDrawalReq.accountNumber);
					hashmap.put(withDrawalReq.accountNumber, (ammount-withDrawalReq.balance));
					treemap.put(withDrawalReq.accountNumber, (ammount-withDrawalReq.balance));
				}
				else {
					System.out.println("Insufficient balance");
				}
			}
			else {
				System.out.println("Account not found please enter write details"+withDrawalReq.accountNumber);
			}
		}
	}
	void displaySorted() {
		System.out.println(treemap);
	}
	
}
