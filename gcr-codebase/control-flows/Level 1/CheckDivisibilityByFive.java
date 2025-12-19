import java.util.Scanner;

public class CheckDivisibilityByFive{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		if(number%5 == 0){
			System.out.println("Is the number "+ number + " divisible by 5 ? "+"yes ");
		}
		else{
			System.out.println("Is the number "+ number + " divisible by 5 ? "+"No ");
		}
	}
}