package com.robowarehouse;

public class Sort {
	public static void insertionSort(Package[] p) {
		
		for(int i=1;i<p.length;i++) {
			Package key = p[i];
			int j=i-1;
			while(j>=0 && key.weight<p[j].weight) {
				p[j+1] = p[j];
				j--;
			}
			p[j+1]= key;
		}
		
	}
}
