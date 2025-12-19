import java.util.Scanner;

public class TableWithArrays{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int [] tableResult = new int[10];
		System.out.print("Enter number");
		int number = sc.nextInt();
		
		
		for(int i=1;i<=10;i++){
		
		int tempResult = number * i;
		tableResult[i-1] = tempResult;
			}
			
		for(int i=0;i<10;i++){
			System.out.println(number + " * "+ (i+1)+ " = " + tableResult[i]);
		}
			
		}
		
		
		
	}
