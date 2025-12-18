import java.util.Scanner;

public class DistanceToKm{
public static void main(String[] args){

	double km ;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("KM :");
	km = sc.nextInt();
	
	double kilometersToMiles = km / 1.6;
	
	
	
	System.out.println("The total miles is " + kilometersToMiles + " for the given  " + km + "KM");
}
}