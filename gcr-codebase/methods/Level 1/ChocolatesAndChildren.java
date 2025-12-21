import java.util.Scanner;

public class ChocolatesAndChildren
{

	public static int[] findRemainderAndQuotient(int chocolates, int children) 
{
		int remainChocolate = chocolates%children;
		int successfulDivide = chocolates/children;
		
		int[] result = new int[2];
		result[0] = remainChocolate;
		result [1] = successfulDivide;
		return result;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of chocolates :");
		int number1 = sc.nextInt();
		
		System.out.println("Enter Number of children :");
		int number2 = sc.nextInt();
		
		
		
		int [] remainderQuotient = findRemainderAndQuotient(number1,number2);
		
		
        System.out.println("Remaining chocolates: " + remainderQuotient[0]);
        System.out.println("Chocolates per child: " + remainderQuotient[1]);
		
		 
	}

}