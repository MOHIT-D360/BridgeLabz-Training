package com.javacollections.listinterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
public class ReverseList {
	
	public static void reverse( List<Integer> l) {
		int j=l.size()-1;
		for(int i=0;i<l.size()/2;i++) {
			int temp = l.get(i);
			l.set(i,l.get(j));
			l.set(j, temp);
			
			j--;
			
		}
	}
	public static void reverseLinkedList(List<Integer> l) {
		int left =0;
		int right = l.size()-1;
		
		while(left<right) {
			int temp = l.get(left);
			l.set(left, l.get(right));
			l.set(right, temp);
			left++;
			right--;
			
		}
	}
	public static void main(String [] args) {
		List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		reverse(l);
		System.out.println(l);
		
		List<Integer> l2 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
		reverseLinkedList(l2);
		System.out.println(l2);
	}
}
