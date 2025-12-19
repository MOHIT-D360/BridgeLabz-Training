import java.util.Scanner;

public class NumberCounter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int number = sc.nextInt();
		
		while(number>=1){
			System.out.print(number+ " ");
			number--;
		}			
	}
}