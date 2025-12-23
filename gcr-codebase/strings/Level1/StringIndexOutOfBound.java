import java.util.Scanner;

public class StringIndexOutOfBound {

	public static void generateExpection(){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		int length = text.length();
		
		System.out.println(text.charAt(length+2));
	}
	public static void handleExpection(){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		int length = text.length();
		
		try{
			System.out.println(text.charAt(length+2));
		}
		catch (StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException => " + e.getMessage());
		}
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
	    
	//	generateExpection();
		
		handleExpection();
		
		
		
		
		

		
	}
}