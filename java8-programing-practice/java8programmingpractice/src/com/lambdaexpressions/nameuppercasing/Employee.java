package com.lambdaexpressions.nameuppercasing;
import java.util.*;
import java.util.function.Function;
import java.util.function.Consumer;


public class Employee {
	

	public static void main(String[] args) {
		List<String> employee = new ArrayList<>();
		
		employee.add("Mohit");
		employee.add("rohit");
		employee.add("vivek");
		employee.add("kuldeep");	
		Function<String,String> fn = String::toUpperCase;
		for(String str:employee) {
			System.out.println(fn.apply(str));}

		
		
	}
}
