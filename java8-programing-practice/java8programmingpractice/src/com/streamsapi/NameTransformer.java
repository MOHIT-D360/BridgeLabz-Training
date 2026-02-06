package com.streamsapi;
import java.util.*;
import java.util.stream.*;

public class NameTransformer {
	public static void main(String[] args) {
		List<String > customers = Arrays.asList("Mohit","rohit","shivanshu","monu","reena","pinki");
		
		customers.stream()
		.map((x)->
			 x.toUpperCase()
				)
		.sorted((m1,m2)-> m1.compareTo(m2))
		.forEach(System.out::println);
		
		
				
	}
}
