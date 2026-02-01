package com.javacollections.mapinterface;
import java.util.*;
import java.io.*;

public class WordFrequencyCounter {
public static void main(String[] args) {
	String fileName = "D:\\trash\\dsa-practice\\java-collection-practice\\gcr-codebase\\javacollectionpractice\\src\\com\\javacollections\\mapinterface\\input.txt";
	Map<String,Integer> wordCount = new HashMap<>();
	try {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		
		while((line= br.readLine())!= null) {
			line = line.toLowerCase();
			
			line = line.replaceAll("[^a-z ]", "");
			
			String[] words = line.split("\\s+");
			
			for(String s:words) {
				if(s.isEmpty()) continue;
				
				wordCount.put(s, wordCount.getOrDefault(s,0)+1);
			}
			
		}
		
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
	System.out.println(wordCount);;
}
}
