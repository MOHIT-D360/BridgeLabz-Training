package com.javacollections.mapinterface.votingsystem;
import java.util.*;
public class JavaMap {
	Map<Vote,Integer> hashMap = new HashMap<>();
	Map<Vote,Integer> treeMap = new TreeMap<>();
	Map<Vote,Integer> linkedHashMap = new LinkedHashMap<>();
	
	void insert(Vote v) {
		String key  = v.candidate;
		Integer value  = v.votes;
		hashMap.put(v, value);
		treeMap.put(v, value);
		linkedHashMap.put(v, value);	
	}
	void display() {
		System.out.println(treeMap);
	}
	void displayInOrder() {
		System.out.println(linkedHashMap);
	}
}
