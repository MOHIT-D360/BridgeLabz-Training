package com.javacollections.mapinterface;
import java.util.*;
public class InvertMap {
	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<>();
		Map<Integer, ArrayList<String>> m2 = new HashMap<>();
		
		m1.put("A", 1);
		m1.put("B", 2);
		m1.put("C", 1);
		
		for(Map.Entry<String,Integer> entry :m1.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			
			if(m2.containsKey(value)) {
				m2.get(value).add(key);
			}else {
				m2.put(value, new ArrayList<>());
				m2.get(value).add(key);
			}
			
		
			
		}
		System.out.println(m2);
		
	}
}
