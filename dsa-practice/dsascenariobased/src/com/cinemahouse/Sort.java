package com.cinemahouse;

public class Sort {
	public static void bubbleSort(Movie[] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=i;j<m.length;j++) {
				if(m[i].noOfShows>m[j].noOfShows) {
					Movie temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
	}
}
