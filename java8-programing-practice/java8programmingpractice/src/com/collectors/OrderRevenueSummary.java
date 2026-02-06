package com.collectors;
import java.util.*;
import java.util.stream.*;

class Customer{
	String name;
	
	 double ammount;
	
	Customer(String name,double ammount){
		this.name = name;
		this.ammount = ammount;
	}
	
	
}
public class OrderRevenueSummary {
	public static void main(String[] args) {
		List<Customer> cus = new ArrayList<>();
		cus.add(new Customer("Mohit", 2312));
		cus.add(new Customer("Rohit", 4312));
		cus.add(new Customer("Mohit", 2512));
		cus.add(new Customer("Rohit", 8312));
		cus.add(new Customer("Harshit",1312));
		cus.add(new Customer("Mohit", 7112));
		
	
		Map<String,Double> mp = cus.stream()
		.collect(Collectors.groupingBy( cust-> cust.name,Collectors.summingDouble(o->o.ammount)));
		
		System.out.println(mp);
	}
}
