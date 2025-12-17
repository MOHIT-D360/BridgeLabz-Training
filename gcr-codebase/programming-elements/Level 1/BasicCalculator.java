import java.util.Scanner;

public class BasicCalculator{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	

	double num1;
	double num2;
	System.out.println("enter first number : ");
	num1 = sc.nextInt();
	
	System.out.println("enter second number : ");
	num2 = sc.nextInt();
	
	double addition = num1 + num2;
	double substraction = num1 - num2;
	double division = num1/num2;
	double multipication = num1*num2;
	
	
	
	
	
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + addition+ " " + substraction + " " + multipication+ " and " + division );
}
}