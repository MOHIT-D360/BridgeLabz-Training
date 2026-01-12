package com.algoritmruntimeanalysis;
import java.util.*;

public class SearchingWithDiffDataStructure {
    public static void main(String[] args) {
        int n = 100000;
        int target = -1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {   
            arr[i] = i;
        }
        long startArraySearch = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found in Array");
                break;
            }
        }
        long endArraySearch = System.nanoTime();
        System.out.println("Array search time: " + (endArraySearch - startArraySearch) + " ns");
        System.out.println("-------------------------------");

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
        long startSetSearch = System.nanoTime();
        if (set.contains(target)) {
            System.out.println("Found in HashSet");
        }
        long endSetSearch = System.nanoTime();
        System.out.println("HashSet search time: " + (endSetSearch - startSetSearch) + " ns");
        System.out.println("-------------------------------");

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            treeSet.add(i);
        }   
        long startTreeSetSearch = System.nanoTime();
        if (treeSet.contains(target)) {
            System.out.println("Found in TreeSet");
        }   
        long endTreeSetSearch = System.nanoTime();
        System.out.println("TreeSet search time: " + (endTreeSetSearch - startTreeSetSearch) + " ns");
    }
}
