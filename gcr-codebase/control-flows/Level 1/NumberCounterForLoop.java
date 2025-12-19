import java.util.Scanner;

public class NumberCounterForLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int number = sc.nextInt();
		
		for(int i =number;i>=1;i--){
			System.out.print(i + " ");
		
		}
}
}