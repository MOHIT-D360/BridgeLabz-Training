package com.javacollections.setinterface;
import java.util.*;

public class SymmetricDifference {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
		
		Set<Integer> sd = new HashSet<>(set1);
		for(int x:set2) {
			if(sd.contains(x)) {
				sd.remove(x);
			}else sd.add(x);
		}
		System.out.println(sd);
		
	}
}
