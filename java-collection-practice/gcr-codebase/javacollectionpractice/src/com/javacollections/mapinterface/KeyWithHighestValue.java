package com.javacollections.mapinterface;
import java.util.*;

public class KeyWithHighestValue {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);
		
		int value = map.get("A");
		String key = "A";
		for(Map.Entry<String,Integer> entry: map.entrySet()) {
			if(entry.getValue()>value) {
				value = entry.getValue();
				key  = entry.getKey();
			}
		}
		System.out.println(key);
	
	}
}
