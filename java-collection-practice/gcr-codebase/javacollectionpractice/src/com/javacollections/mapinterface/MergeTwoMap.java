package com.javacollections.mapinterface;
import java.util.*;

public class MergeTwoMap {
public static void main(String[] args) {
	Map<String,Integer> m1 = new HashMap<String,Integer>();
	Map<String,Integer> m2 = new HashMap<String,Integer>();
	
	m1.put("A", 1);
	m1.put("B", 2);
	
	m2.put("B", 3);
	m2.put("C", 4);
	Map<String,Integer> mergeMap = new HashMap<>(m1);
	
	for(Map.Entry<String,Integer> entry: m2.entrySet()) {
		String key = entry.getKey();
		int value = entry.getValue();
		
		if(mergeMap.containsKey(key)) {
			mergeMap.put(key,mergeMap.get(key)+value);
		}
		else {
			mergeMap.put(key, value);
		}	
	}
	System.out.println(mergeMap);
}
}
