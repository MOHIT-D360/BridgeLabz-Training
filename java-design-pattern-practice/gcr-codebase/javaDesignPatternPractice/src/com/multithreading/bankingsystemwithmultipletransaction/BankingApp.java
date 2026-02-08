package com.multithreading.bankingsystemwithmultipletransaction;

public class BankingApp {
 public static void main(String[] args) throws Exception{
	 BankAccount b1 =new BankAccount();
	Transaction t1 = new Transaction(b1,"customer-1",3000);
	Transaction t2 = new Transaction(b1,"customer-2",4000);
	Transaction t3 = new Transaction(b1,"customer-3",2000);
	Transaction t4 = new Transaction(b1,"customer-4",5000);
	Transaction t5 = new Transaction(b1,"customer-5",1500);
	
	Thread th1 = new Thread(t1);
	Thread th2 = new Thread(t2);
	Thread th3 = new Thread(t3);
	Thread th4 = new Thread(t4);
	Thread th5 = new Thread(t5);
	
	th1.start();
	th2.start();
	th3.start();
	th4.start();
	th5.start();
	
	
	
	
}
}
