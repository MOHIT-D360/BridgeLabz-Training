package com.streamsapi;
import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;

class Gym{
	String name;
	LocalDate expiryDate;
	Gym(String name,LocalDate expiryDate){
		this.name= name;
		this.expiryDate = expiryDate;
	}
	public String toString() {
		return name ;
	}
}

public class FilteringExpiringMemberships {
	public static void main(String[] args) {
		  List<Gym> members = new ArrayList<>();

	        members.add(new Gym("Amit", LocalDate.now().plusDays(10)));
	        members.add(new Gym("Rohit", LocalDate.now().plusDays(40)));
	        members.add(new Gym("Neha", LocalDate.now().plusDays(25)));
	        members.add(new Gym("Pooja", LocalDate.now().plusDays(5)));
	        members.add(new Gym("Karan", LocalDate.now().plusDays(60)));
	        
	        LocalDate today = LocalDate.now();
	        LocalDate next30Days = today.plusDays(30);
	        
	        members.stream()
	        	.filter(m->
	        		m.expiryDate.isAfter(today)&&m.expiryDate.isBefore(next30Days)	
	        			)
	        	.forEach(x->System.out.println(x));
	        	
	}
}
