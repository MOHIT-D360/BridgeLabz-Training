package com.exceptions.finallyblockexecution;
import java.util.Scanner;

public class FinallyBlock {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num1 :");
	int num1 = sc.nextInt();
	System.out.println("Enter num2 :");
	int num2 = sc.nextInt();
	
	try {
		double result = num1/num2;
		System.out.println(result);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Operation completed");
	}
}
}
