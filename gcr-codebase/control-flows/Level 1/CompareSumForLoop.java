import java.util.Scanner;

public class CompareSumForLoop
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			int totalSum = 0;
			System.out.print("Enter number : ");
			int number = sc.nextInt();
			
		
		for(int i=number;i>0;i--){
			totalSum = totalSum + i;		
		}
		
		int totalSumByFormula = (number*(number+ 1))/2;
		
		System.out.print("Total sum by loops is: "+ totalSum+ " and total sum by formula is :" + totalSumByFormula);
		}
}