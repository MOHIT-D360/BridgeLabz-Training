import java.util.Scanner;

public class CheckNumberBehavior{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int [] number = new int[5];
		System.out.print("Enter five number");
		for(int i=0;i<5;i++){
			number[i] = sc.nextInt();
			
		}
		for(int i=0;i<5;i++){
			if(number[i]>0){
			
				if(number[i] %2 ==0){
					System.out.println("even :"+number[i]);
				}
				else{
					System.out.println("odd :"+number[i]);
				}
				
			
			}
			else if(number[i] == 0){
					System.out.println("zero");
				}
				else {
					System.out.println("Negative number");
				}

			}
			if(number[0] == number[4]){
				System.out.println("equal");
			}
			else if(number[0]>number[4]){
				System.out.println("Greater number is :"+ number[0]);
			}
			else if(number[0]<number[4]){
				System.out.println("Greater number is :"+ number[4]);
			}
			
		}
		
		
		
	}
