import java.util.Scanner;

public class SumOfNumbersInfiniteLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			double totalSum = 0.0;
		
		while(true){
			System.out.print("Enter number : ");
			double userNumber = sc.nextDouble();
			
			if(userNumber<=0){
				break;
			}
			else{
				totalSum = totalSum + userNumber;
			}	
		}
		System.out.print("Total sum is : "+ totalSum);
		}
}