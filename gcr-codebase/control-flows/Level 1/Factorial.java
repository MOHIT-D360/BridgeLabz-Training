import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int i=1;
		int factorial =1;
		while(i<=number){
		
		factorial *= i;
		i++;}
		System.out.print("The factorial of " + number + " is " + factorial);
		
		}
}