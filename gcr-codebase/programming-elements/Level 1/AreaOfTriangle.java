import java.util.Scanner;

public class AreaOfTriangle{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	

	double base;
	double height;
	System.out.println("Enter base of a triangle : ");
	base = sc.nextInt();
	
	System.out.println("Enter height of a triangle : ");
	height = sc.nextInt();
	
	double ArOfTriangle = 0.5 * base * height;
	
	double AreaInInches = ArOfTriangle * (1.0/2.54);
	double AreaInFeet = AreaInInches * (1.0/12.0);
	
	
	
	System.out.println("Your Area in cm is " + ArOfTriangle + "While in feet is " + AreaInFeet + " and inches is " + AreaInInches);
	
	
	
}
}