public class DiscountedFee{
public static void main(String[] args){

	int fee = 125000;
	int discountPercent = 10;
	double discountAmmount =  (fee * ((double)discountPercent/100));
	double discoutedFee =  fee - discountAmmount;
	
	
	System.out.println("The discount amount is INR " + discountAmmount + " and final discounted fee is INR " + discoutedFee);
}
}