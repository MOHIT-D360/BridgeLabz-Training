package com.filehandling.wordcount;
import java.io.*;
import java.util.*;

public class WordCountApp {
	public static void main(String[] args) {
		String filePath = "D:\\Saved\\input.txt";
		
		HashMap <String,Integer> hm = new HashMap<>();
		int totalWords =0;
		
		try(BufferedReader br = new BufferedReader (new FileReader(filePath))
				
				){
			String line;
			while((line = br.readLine()) != null) {
				String[] words = line.toLowerCase().split("\\W+");
				for(String word : words) {
					if(word.isEmpty()) 
						continue;
						
						totalWords++;
						hm.put(word, hm.getOrDefault(word, 0)+1);
						
					
				}
			}
		}
		catch(IOException e) {
			System.out.println("Error :"+ e.getMessage());
		}
		
		System.out.println("Total Words : "+totalWords);
		int index =0;
		int targetIndex = 5;
		
		Map<String,Integer> tm = new TreeMap<>(hm);
		for(Map.Entry<String, Integer> entry: tm.entrySet() ) {
			if(index < targetIndex) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
				
			}
			index++;
			
		}
	}
}
