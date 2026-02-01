package com.javacollections.setinterface;
import java.util.*;

public class FindSubSet {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>(Arrays.asList(2,4));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3,4));
		
		
//		int s1Size = s1.size();
//		int count =0;
//		for(int x:s1) {
//			if(s2.contains(x)) {
//				count++;
//			}
//		}
//		if(count == s1Size) {
//			System.out.println("True");
//		}
//		else {
//			System.out.println("False");
//		}
		
		boolean isSubset = s2.containsAll(s1);
		System.out.println(isSubset);
	}
}
