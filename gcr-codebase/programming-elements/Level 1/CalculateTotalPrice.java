import java.util.Scanner;

public class CalculateTotalPrice{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	

	int UnitPrice;
	System.out.println("enter Unit Price: ");
	UnitPrice = sc.nextInt();
	
	int quantity;
	System.out.println("enter quantity: ");
	quantity = sc.nextInt();
	
	int totalPurchase  = UnitPrice * quantity;
	
	System.out.println("The total purchase price in INR "+ totalPurchase + " if the quantity " + quantity + " and unit price is INR " + UnitPrice );
}
}