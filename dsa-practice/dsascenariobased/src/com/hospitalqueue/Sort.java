package com.hospitalqueue;

public class Sort {
//	Patient[] p1 = new Patient[10];
	Sort(Patient[] p){
		bubbleSort(p);
	}
	private void  bubbleSort(Patient[] p) {
		for(int i=0;i<p.length;i++) {
			for(int j=i;j<p.length;j++) {
				if(p[i].criticality>p[j].criticality) {
					Patient temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
//		return p1;
	}
	
	
}
