import java.util.Scanner;

public class SwitchCaseCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter number 1 : ");
		double first = sc.nextDouble();
		
		System.out.print("Enter number 2 : ");
		double second = sc.nextDouble();
		
		System.out.print("Enter operator: ");
		String op = sc.next();
		
		switch(op) {
			case "+" : System.out.println("sum is "+(first+second)); break;
			case "-" : System.out.println("sum is "+(first-second)); break;
			case "*" : System.out.println("sum is "+(first*second)); break;
			case "/" : System.out.println("sum is "+(first/second)); break;
			default: System.out.println("Invalid operator");
		}		
		}
}