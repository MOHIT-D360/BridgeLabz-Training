import java.util.Scanner;

public class DoubleOpt{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	double a,b,c;
	
	System.out.println("Enter a:");
	a = sc.nextInt();
	
	System.out.println("Enter b:");
	b = sc.nextInt();
	
		System.out.println("Enter c:");
	c = sc.nextInt();
	
	double expression1 = a + b *c;
	double expression2 = a * b + c;
	double expression3 = a % b + c;
	
	
	System.out.println("The results of Int Operations are " + expression1+ "," + expression2 + ",and " + expression3);
}
}