import java.util.Scanner;

public class TableWithArrays6to9{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int [] tableResult = new int[4];
		System.out.print("Enter number");
		int number = sc.nextInt();
		
		
		for(int i=6;i<=9;i++){
		
		int tempResult = number * i;
		tableResult[i-6] = tempResult;
			}
			
		for(int i=0;i<4;i++){
			System.out.println(number + " * "+ (i+6)+ " = " + tableResult[i]);
		}
			
		}
		
		
		
	}
