package com.sortingalgorithm;
import java.util.*;

public class InsertionSort {
	
	private static void sort (int[] arr) {
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int key  = arr[i];
			int j= i-1;
			while(j>= 0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			 arr[j + 1] = key;
		}
	}
	
	
	public static void main(String[] args) {
		int[] id = {4, 3, 6, 0, 1, 5};
		sort(id);
		
		System.out.println(Arrays.toString(id));
	}
}
