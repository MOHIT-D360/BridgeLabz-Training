import java.util.Scanner;

public class DistanceInYardsAndMiles{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	

	int DistanceInFeets;
	System.out.println("enter Distance: ");
	DistanceInFeets = sc.nextInt();
	
	double DistanceInYards = DistanceInFeets * (1.0/3.0);
	double DistanceInMiles = DistanceInYards * (1.0/1760.0);
	
	
	
	System.out.println("Your Distance in feet is " + DistanceInFeets + " while in yards is  " + DistanceInYards + " and miles is " + DistanceInMiles );
}
}