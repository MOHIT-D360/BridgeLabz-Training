package com.algoritmruntimeanalysis;

public class FibonacciRecursiveIterative {
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
    public static void main(String[] args) {
        int n = 20;
        long startRecursive = System.nanoTime();
        recursiveFibonacci(n);
        long endRecursive = System.nanoTime();
        System.out.println("Recursive Fibonacci time: " + (endRecursive - startRecursive) + " ns");
        long startIterative = System.nanoTime();
        iterativeFibonacci(n);  
        long endIterative = System.nanoTime();
        System.out.println("Iterative Fibonacci time: " + (endIterative - startIterative) + " ns");
        
    }
}
