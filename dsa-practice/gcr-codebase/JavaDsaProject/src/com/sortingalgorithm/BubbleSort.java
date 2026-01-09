package com.sortingalgorithm;

public class BubbleSort {
	static void sort(int[] marks) {
		int n = marks.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n-1;j++) {
				if(marks[j]>marks[j+1]) {
					int temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String [] args) {
		int[] marks = {5,1,2,6,2,8};
		sort(marks);
		
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+ " ");
		}
	}

}
