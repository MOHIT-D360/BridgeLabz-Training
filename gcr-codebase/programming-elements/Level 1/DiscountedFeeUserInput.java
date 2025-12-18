import java.util.Scanner;

public class DiscountedFeeUserInput{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	

	int fee ;
	System.out.println("enter fee: ");
	fee = sc.nextInt();
	
	int discountPercent ;
	System.out.println("enter discount: ");
	discountPercent = sc.nextInt();
	
	
	double discountAmmount =  (fee * ((double)discountPercent/100));
	double discoutedFee =  fee - discountAmmount;
	
	
	System.out.println("The discount amount is INR " + discountAmmount + " and final discounted fee is INR " + discoutedFee);
}
}