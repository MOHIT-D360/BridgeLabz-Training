package com.algoritmruntimeanalysis;

public class SearchTarget {
    public static void linearSearch(int[] brr,int target){
        for(int i=0;i<brr.length;i++){
            if(brr[i] == target){
                System.out.println("Found");
                break;
            }
        }
        System.out.println("Not Found");
    }
        int high = brr.length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(brr[mid]== target){
                System.out.println("found  : "+ mid);
                return ;
            }
            else if(target<brr[mid]){
                high = mid-1;
            }
            else low= mid+1;
        }
        return;
    }
    public static void main(String[] args) {
        int n = 10000;
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= i;
        }
        int target =-1;

        long startLinearTime = System.nanoTime();
        linearSearch(arr,target);
        long endLinearTime = System.nanoTime();

        System.out.println("Linear search time is :"+ (endLinearTime-startLinearTime)+ "ms");


         long startBinaryTime = System.nanoTime();
        binarySearch(arr,target);
        long endBinaryTime = System.nanoTime();

        System.out.println("Binary search time is :"+ (endBinaryTime-startBinaryTime)+ "ms");
    }
}
