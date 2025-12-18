import java.util.Scanner;

public class PerimeterToSide{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	double perimeterOfSquare;
	System.out.println("Enter perimeter of Square :");
	perimeterOfSquare = sc.nextInt();
	
	double sideOfSquare = perimeterOfSquare/4.0;
	
	System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeterOfSquare );
	
}
}