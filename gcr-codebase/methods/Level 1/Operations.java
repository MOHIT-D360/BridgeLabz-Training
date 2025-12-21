import java.util.Scanner;

public class Operations{

	public static void remainderQuotient(int number1,int number2){
		int remainder = number1%number2;
		int quotient = number1/number2;
		
	System.out.print("Remainder of a number is :"+remainder+ " and quotient of a number is :"+quotient);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		int number1 = sc.nextInt();
		
		System.out.println("Enter Number 2 :");
		int number2 = sc.nextInt();
		
		
		
		remainderQuotient(number1,number2);
		
		 
	}

}