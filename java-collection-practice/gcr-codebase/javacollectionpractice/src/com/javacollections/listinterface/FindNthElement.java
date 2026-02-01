package com.javacollections.listinterface;

import java.util.Arrays;
import java.util.*;

public class FindNthElement {
	public static void main(String [] args) {
		List<Character> list  = new LinkedList<>(Arrays.asList('A','B','C','D','E'));
		int N =2;
		// we have to find Nth index from the end;
		char temp = 0 ;
		for(int i = 0;i<N;i++) {
			
		 temp = 	list.remove(list.indexOf(list.getLast()));
		}
		System.out.println(temp);
	}
}
