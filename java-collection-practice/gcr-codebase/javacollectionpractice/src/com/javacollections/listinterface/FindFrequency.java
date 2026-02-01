package com.javacollections.listinterface;
import java.util.*;

public class FindFrequency {
	public static void main(String [] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("apple","banana","apple","orange"));
		
		
		Map<String,Integer> map = new HashMap<>();
//		for(int i =0;i<list.size();i++) {
//			String element = list.get(i);
//			
//			if(map.containsKey(element)) {
//				map.put(element, map.get(element)+1);
//			}
//			else {
//				map.put(element, 1);
//			}
//	}
//		
//		System.out.println(map);
		
		for(String s : list) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
}
	}
