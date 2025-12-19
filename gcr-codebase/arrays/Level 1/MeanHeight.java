import java.util.Scanner;

public class MeanHeight{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int [] footballerHeight = new int[11];
		System.out.print("Enter number");
		
		int sum =0;
		
		for(int i=0;i<11;i++){
			footballerHeight[i] = sc.nextInt();
		}
		
		for(int i=0;i<11;i++){
			sum = sum + footballerHeight[i];
		}
		int meanHeight = sum /11;
		
		
		System.out.println("Mean Height of a team is  "+meanHeight);
			
		}
		
		
		
	}
 