package com.sortingalgorithm;



import java.util.Arrays;

public class MergeSort {
	static void merge(int[] prices, int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;

	    int[] arr1 = new int[n1];
	    int[] arr2 = new int[n2];

	    for (int i = 0; i < n1; i++) arr1[i] = prices[left + i];
	    for (int j = 0; j < n2; j++) arr2[j] = prices[mid + 1 + j];

	    int i = 0;
	    int j = 0;
	    int k = left;

	    while (i < n1 && j < n2) {
	        if (arr1[i] <= arr2[j]) prices[k++] = arr1[i++];
	        else prices[k++] = arr2[j++];
	    }

	    while (i < n1) prices[k++] = arr1[i++];
	    while (j < n2) prices[k++] = arr2[j++];
	}
	
	private static void sort(int left, int right, int[] prices) {
		if (left >= right) return;

	    int mid = left + (right - left) / 2;

	    sort(left, mid, prices);
	    sort(mid + 1, right, prices);

	    merge(prices, left, mid, right);
	}
	

	static void quickSort(int[] prices,int low,int high){
		if(low>=high) return ;

		int partition = partition(prices,low,high);

		quickSort(prices, low, partition-1);
		quickSort(prices, partition+1, high);
	}

	static int partition(int[] prices,int low,int high){
		int pivot = prices[low];
		int count =0;
		for(int i=low+1;i<prices.length;i++){
			if(pivot<prices[i]){
				count++;
			}
		}
		int pivotIndex = low + count;
		swap(prices,prices[low],prices[pivotIndex]);
		int i=low;
		int j=high;
		while(i<pivotIndex && j> pivotIndex){
			while(prices[i]<pivot){
				i++;
			}
			while(prices[j]>pivot){
				j--;
			}
			if(i<pivotIndex && j> pivotIndex){
				swap(prices,prices[i++],prices[j++]);
			}
		}
		return pivotIndex;
	
	}

	public static void swap(int [] prices,int x,int y){
		int temp = prices[x];
		prices[x] = prices[y];
		prices[y]= temp;
	}
	public static void main(String[] args) {
		int[] prices = {5, 4, 7, 1, 2, 0};
		// sort(0, prices.length-1, prices);
		quickSort(prices, 0, prices.length);

		
		System.out.println(Arrays.toString(prices));
	}
}