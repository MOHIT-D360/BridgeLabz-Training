package com.zipzipmart;

public class Sort {
	Sort(Sale[] sales){
		mergeSort(sales);
		mergeSortOnPrice(sales);
	}
	private void mergeSort(Sale[] sales) {
		int left =0;
		int right = sales.length-1;
		sort(left,right, sales);
	}
	
	void sort(int left,int right,Sale[] sales){
		if(left>= right) return ;
		
		int mid = left+ (right-left)/2;
		
		sort(left,mid,sales);
		sort(mid+1,right,sales);
		
		merge(sales,left,mid,right);
	}
	
	void merge(Sale[] sales,int left,int mid ,int right){
		    int n1 = mid -left+1;
		    int n2 = right -mid;
		    
		    Sale[] arr1 = new Sale[n1];
		    Sale[] arr2 = new Sale[n2];
		    
		    for(int i=0;i<n1;i++) arr1[i] = sales[left+i];
		    for(int j=0;j<n2;j++) arr2[j] = sales[mid+1+j];
		    
		    int i=0;
		    int j=0;
		    int k=left;
		    while(i<n1 && j<n2) {
		    	if(arr1[i].dateNumber<= arr2[j].dateNumber) {
		    		sales[k++] = arr1[i++];
		    		
		    	}
		    	else sales[k++] = arr2[j++];
		    	
		    }
		    while (i<n1) sales[k++] = arr1[i++];
		    while (j<n2) sales[k++] = arr2[j++];
	}
	
	private void mergeSortOnPrice(Sale[] sales) {
		int left =0;
		int right = sales.length-1;
		sortOnPrice(left,right, sales);
	}
	private void sortOnPrice(int left,int right,Sale[] sales){
		if(left>= right) return ;
		
		int mid = left+ (right-left)/2;
		
		sort(left,mid,sales);
		sort(mid+1,right,sales);
		
		mergeOnPrice(sales,left,mid,right);
	}
	void mergeOnPrice(Sale[] sales,int left,int mid ,int right){
	    int n1 = mid -left+1;
	    int n2 = right -mid;
	    
	    Sale[] arr1 = new Sale[n1];
	    Sale[] arr2 = new Sale[n2];
	    
	    for(int i=0;i<n1;i++) arr1[i] = sales[left+i];
	    for(int j=0;j<n2;j++) arr2[j] = sales[mid+1+j];
	    
	    int i=0;
	    int j=0;
	    int k=left;
	    while(i<n1 && j<n2) {
	    	if(arr1[i].amount<= arr2[j].amount) {
	    		sales[k++] = arr1[i++];
	    		
	    	}
	    	else sales[k++] = arr2[j++];
	    	
	    }
	    while (i<n1) sales[k++] = arr1[i++];
	    while (j<n2) sales[k++] = arr2[j++];
}
}
