package com.lambdaexpressions.invoiceobjectcreation;

public class Invoice {
	private int transactionId;
	
	public Invoice(int transactionId) {
		this.transactionId = transactionId;
	}
	
	public String toString() {
		return "Invoice generated for Transaction ID: "+transactionId;
	}
}
