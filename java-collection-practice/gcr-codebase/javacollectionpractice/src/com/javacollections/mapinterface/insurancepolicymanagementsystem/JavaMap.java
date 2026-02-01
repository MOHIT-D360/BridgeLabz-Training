package com.javacollections.mapinterface.insurancepolicymanagementsystem;
import java.time.*;
import java.util.*;

public class JavaMap {
	
	
		Map<Integer,Policy> hashmap = new HashMap<>();
		Map<Integer,Policy> linkedhashmap = new LinkedHashMap<>();
		Map<Integer,Policy> treemap = new TreeMap<>();
		
	void insert(Policy p) {
		hashmap.put(p.policyNumber, p);
		linkedhashmap.put(p.policyNumber, p);
		treemap.put(p.policyNumber, p);
	}
	void retrieve(Integer number) {
		System.out.println(hashmap.containsKey(number));
	}
	void showExpiringPolicy() {
		LocalDate todayDate = LocalDate.now();
		LocalDate limit = todayDate.plusDays(30);
		
		for(Map.Entry<Integer, Policy> plcy : treemap.entrySet()) {
			Policy p = plcy.getValue();
			if(!p.expiryDate.isBefore(todayDate)
					&& 
				!p.expiryDate.isAfter(limit)) {
				System.out.println(p);
			}
		}
	}
	
	void showpolicy(String name) {
		for(Map.Entry<Integer, Policy> plcy : treemap.entrySet()) {
			if(name == plcy.getValue().policyHolderName) {
				System.out.println(plcy.getValue());
			}
		}
	}
	
	void remove() {
		LocalDate  current = LocalDate.now();
		for(Map.Entry<Integer, Policy> plcy : treemap.entrySet()) {
			if(current.isAfter(plcy.getValue().expiryDate) || current.isEqual(plcy.getValue().expiryDate)) {
//				hashmap.clear(plcy.getKey());
				hashmap.remove(plcy.getKey());
			}
		}
	}
	
	void displaySorted() {
		System.out.println(treemap);
	}
	
		
		
	
}
