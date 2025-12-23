import java.util.Scanner;

public class IllegalArgument {

	public static void generateExpection(){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		
		System.out.println(text.substring(3,2));
	}
	public static void handleExpection(){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		try{
			System.out.println(text.substring(3,2));
		}
		catch (IllegalArgumentException e){
			System.out.println("IllegalArgumentException => " + e.getMessage());
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException => " + e.getMessage());
		}
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
	    
		// generateExpection();
		
		handleExpection();
		
		
		
		
		

		
	}
}