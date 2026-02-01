package com.javacollections.insurancepolicymanagementsystem;
import java.util.*;
import java.time.LocalDate;

public class JavaSet {
	Set<Policy> hashmap = new HashSet<>();
	Set<Policy> linkedhashmap = new LinkedHashSet<>();
	Set<Policy> treeset= new TreeSet<>();
	
	void insert(Policy e) {
		hashmap.add(e);
		linkedhashmap.add(e);
		treeset.add(e);
	}
	public void showAllPolicies() {
        hashmap.forEach(System.out::println);
    }
	
	 public void showExpiringSoonPolicies() {

	        LocalDate today = LocalDate.now();
	        LocalDate limit = today.plusDays(30);

	        for (Policy p : treeset) {
	            if (!p.expiryDate.isBefore(today) &&
	                !p.expiryDate.isAfter(limit)) {
	                System.out.println(p);
	            }
	        }
	    }
	    public void showPoliciesByCoverage(String coverage) {

	        for (Policy p : hashmap) {
	            if (p.coverageType.equalsIgnoreCase(coverage)) {
	                System.out.println(p);
	            }
	        }
	    }
	    
	    public void findDuplicatePolicies(List<Policy> policies) {

	        Set<String> seen = new HashSet<>();
	        Set<String> duplicates = new HashSet<>();

	        for (Policy p : policies) {
	            if (!seen.add(p.policyNumber)) {
	                duplicates.add(p.policyNumber);
	            }
	        }

	        System.out.println("Duplicate Policy Numbers: " + duplicates);
	    }

	    
	
}	
