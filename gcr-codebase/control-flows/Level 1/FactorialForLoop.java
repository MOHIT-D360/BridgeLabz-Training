import java.util.Scanner;

public class FactorialForLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		int factorial =1;
		if(number>0){
			for(int i=number;i<0;i--){
				factorial *=i;
			}
		}
		
		System.out.print("The factorial of " + number + " is " + factorial);
		
		}
}