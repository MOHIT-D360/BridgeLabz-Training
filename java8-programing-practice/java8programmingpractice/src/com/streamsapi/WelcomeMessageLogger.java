package com.streamsapi;
import java.util.*;



public class WelcomeMessageLogger {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Rohit","shivanshu","roshni","tarun");
		
		//welcome
		
		names.stream()
		.forEach(x->System.out.println("Welcome "+x));
	}
	
	
	
	
}
