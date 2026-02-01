package com.javacollections.setinterface;
import java.util.*;

public class UnionAndIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
		Set<Integer> union = new HashSet<>();
		Set<Integer> intersection = new HashSet<>();
		
		for(int x:set1) {
			union.add(x);
		}
		for(int x:set2) {
			union.add(x);
		}
		//intersection
		for(int x:set1) {
			if(set2.contains(x)) {
				intersection.add(x);
			}
		}
		
		System.out.println(union);
		System.out.println(intersection);
	}

}
