package com.exceptions.uncheckedexception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Divide {
	public static void main(String[] args) {
		System.out.println("----------------- Division ------------------------");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter first No. :");
			int num1 = sc.nextInt();
			System.out.println("Enter second No. :");
			int num2 = sc.nextInt();
			double divide = (num1/num2);
			System.out.println("Answer :"+divide);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " Error Arithmetic ");
		}
		catch(InputMismatchException e) {
			System.out.println(e.getLocalizedMessage() + " input mismatched error !");
		}
	}
}
