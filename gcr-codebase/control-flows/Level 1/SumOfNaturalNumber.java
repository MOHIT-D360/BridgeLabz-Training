import java.util.Scanner;

public class SumOfNaturalNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		
		if(number>0){
			int naturalSum = (number * (number+1) )/2;
			System.out.println("The sum of "+ number + "natural numbers is " + naturalSum);
		}
		
		
		

		
	}
}