package com.javacollections.mapinterface.insurancepolicymanagementsystem;
import java.time.*;
import java.util.*;

//import com.javacollections.insurancepolicymanagementsystem.Policy;
public class App {
	public static void main(String[] args) {
		JavaMap jm = new JavaMap();
		
		  Policy p1 = new Policy(101, "Alice",
	                LocalDate.now().plusDays(10), "Health", 5000);

	        Policy p2 = new Policy(102, "Bob",
	                LocalDate.now().plusDays(40), "Auto", 3000);

	        Policy p3 = new Policy(103, "Carol",
	                LocalDate.now().plusDays(20), "Health", 7000);

	        Policy p4 = new Policy(101, "Alice Duplicate",
	                LocalDate.now().plusDays(10), "Health", 5000);
	        
	        jm.insert(p1);
	        jm.insert(p2);
	        jm.insert(p3);
	        jm.insert(p4);
	        
	       // retrieve by number 
	        jm.retrieve(103);
	        
	        //show expiring policy
	        System.out.println("Showing expiring policy");
	        jm.showExpiringPolicy();
	        
	        //show policy by name
	        jm.showpolicy("Alice");
	        
	        // remove by expiry date
	        jm.remove();
	        
	        //displaying sorted
	        System.out.println("Display Sorted list");
	        jm.displaySorted();
	        
	}
}
