import java.util.Scanner;

public class CmToFeetAndInches{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	

	int heightInCM ;
	System.out.println("enter height in CM: ");
	heightInCM = sc.nextInt();
	
	double CmToInches = ((double)heightInCM) * (1.0/2.54);
	double CmToFeet = CmToInches * (1.0/12.0);
	
	
	
	System.out.println("Your Height in cm is " + heightInCM + " while in feet is  " + CmToFeet + " and inches is "+ " and inches is " + CmToInches);
}
}