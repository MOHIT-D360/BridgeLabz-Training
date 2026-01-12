package com.algoritmruntimeanalysis;
import java.util.Arrays;
import java.util.Random;

public class SortTarget {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
                }
            }
        }
    }

     public static void mergeSort(int[] arr){

if(arr.length < 2) return;

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right){
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while(i < left.length){
            arr[k++] = left[i++];
        }

        while(j < right.length){
            arr[k++] = right[j++];
        }
    }


     public static void quickSort(int[] arr,int low ,int high){

        if(low<high){
            int  pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);   
        }   
        
    }
    private static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    
    public static void main(String[] args){

        int[] arr = new int[10000];
        for(int i=0;i<arr.length;i++){
            arr[i]= 1+ (int)(Math.random() * ((10000 -1) + 1));
        }
        long bubbleStartTime = System.nanoTime();
        bubbleSort(arr);
        long bubbleEndTime = System.nanoTime();
        System.out.println("Bubble sort time :"+ (bubbleEndTime-bubbleStartTime));
        System.out.println("----------------------------");

        long mergeStartTime = System.nanoTime();
        mergeSort(arr);
        long mergeEndTime = System.nanoTime();
        System.out.println("Merge sort time :"+ (mergeEndTime-mergeStartTime));
        System.out.println("----------------------------");

        long quickStartTime = System.nanoTime();
        quickSort(arr,0,arr.length-1);
        long quickEndTime = System.nanoTime();
        System.out.println("Quick sort time :"+ (quickEndTime-quickStartTime));
        System.out.println("----------------------------");
    }

}
