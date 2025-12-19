import java.util.Scanner;

public class CompareSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			int totalSum = 0;
			System.out.print("Enter number : ");
			int number = sc.nextInt();
			int cpyNumber = number;
		
		while(number>0){
			totalSum = totalSum + number;
			number--;
			
		}
		
		int totalSumByFormula = (cpyNumber*(cpyNumber + 1))/2;
		
		System.out.print("Total sum by loops is: "+ totalSum+ " and total sum by formula is :" + totalSumByFormula);
		}
}