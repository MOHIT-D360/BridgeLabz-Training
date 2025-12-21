import java.util.Scanner;

public class NumberFinder{

	public static void largestSmallestNumberFinder(int number1,int number2,int number3){
	int greatest = number1;
	int smallest = number1;
	if(number2>greatest){
		greatest = number2;
	}
	if(number3>greatest){
		greatest = number3;
	}
	if(number2<smallest){
		smallest = number2;
	}
	if(number3<smallest){
		smallest = number3;
	}
	System.out.print("Greatest number is :"+greatest+ " and smallest number is :"+smallest);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		int number1 = sc.nextInt();
		
		System.out.println("Enter Number 2 :");
		int number2 = sc.nextInt();
		
		System.out.println("Enter Number 3 :");
		int number3 = sc.nextInt();
		
		largestSmallestNumberFinder(number1,number2,number3);
		
		 
	}

}