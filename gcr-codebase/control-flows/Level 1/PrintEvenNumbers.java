import java.util.Scanner;

public class PrintEvenNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		if(number>0){
			for(int i=0;i<number;i++){
				if(i%2==0){
					System.out.print(i + " ");
				}
			}
		}
		
		
		
		}
}