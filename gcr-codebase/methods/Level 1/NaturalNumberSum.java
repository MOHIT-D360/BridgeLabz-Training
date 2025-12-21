import java.util.Scanner;

public class NaturalNumberSum{

	public static int sumCalculator(int number ){
	
	
	int sum = 0;
	for(int i=0;i<=number;i++){
		sum  = sum + i;
	}
	return sum ;

	
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		
		int number = sc.nextInt();
		
		if(number>0){
					System.out.println("Sum of n number is :" +sumCalculator(number));
		}
		else{
			System.out.println("Invalid numeber");
		}


		
	}

}