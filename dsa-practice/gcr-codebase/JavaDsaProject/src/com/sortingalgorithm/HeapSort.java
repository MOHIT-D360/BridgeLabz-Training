package com.sortingalgorithm;
import java.util.*;

public class HeapSort {
	private static void sort(int[] arr) {
		int n = arr.length;
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<> ((a,b)-> b-a);
		
		for(int a : arr) maxHeap.add(a);
		for(int i=n-1;i>=0;i--) {
			arr[i] = maxHeap.remove();
		}
	}
	
	public static void main(String [] args) {
		int[] arr = {4000,3000,6000,2000,1000};
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
