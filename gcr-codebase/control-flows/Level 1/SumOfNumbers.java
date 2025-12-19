import java.util.Scanner;

public class SumOfNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			double totalSum = 0.0;
		
		System.out.print("Enter number : ");
		double userNumber = sc.nextDouble();
		
		while(userNumber!=0){
			totalSum = totalSum + userNumber;
			
			System.out.print("Enter number : ");
		     userNumber = sc.nextDouble();
		}
		
		System.out.print("Total sum is : "+ totalSum);
		}
}