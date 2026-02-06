package com.lambdaexpressions.invoiceobjectcreation;
import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> transactionId = Arrays.asList(101,102,103,104);
		
		
		Function<Integer,Invoice> invoiceGenerator = Invoice::new;
		
		List<Invoice> invoices = new ArrayList<>();
		for(Integer n:transactionId) {
			invoices.add(invoiceGenerator.apply(n));
		}
		
		invoices.forEach(System.out::println);
	}
}
