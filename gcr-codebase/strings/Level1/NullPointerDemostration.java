import java.util.Scanner;

public class NullPointerDemonstration {

	
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		String text = null;
		try{
					String s2 = text.toUpperCase();
		System.out.print(s2);
			
		}
		catch(NullPointerException e){
			System.out.println("ArithmeticException => " + e);

		}
		
		

		
	}
}