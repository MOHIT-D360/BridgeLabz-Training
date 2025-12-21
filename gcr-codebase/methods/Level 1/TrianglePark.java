import java.util.Scanner;

public class TrianglePark{

	public static void roundsCalculator(int a,int b,int c,int distance ){
	
		int perimeter = (a+b+c);
		
		distance = distance*1000;
		int rounds = distance/perimeter;
		System.out.println("The Total number of rounds are " +rounds);
	
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side a :");
		int a = sc.nextInt();
		System.out.println("Enter side b :");
		int b = sc.nextInt();
		System.out.println("Enter side c :");
	
		int c = 	sc.nextInt();
		
		int distance = 5;
		roundsCalculator(a,b,c,distance);
		
	}

}