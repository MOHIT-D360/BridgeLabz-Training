package com.javacollections.listinterface;

import java.util.Arrays;
import java.util.*;

public class RemoveDuplicate {
	public static void main(String [] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
//		for(int i:list) {
//			if(list.contains(i)) {
//				
//			}
//		}
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
		System.out.println(list);
	}
}
