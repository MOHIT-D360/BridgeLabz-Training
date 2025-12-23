import java.util.Scanner;

public class NumberFormat {

	public static void generateExpection(){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		System.out.println(Integer.parseInt(text));
	}
	public static void handleExpection(){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		
		try{
			System.out.println(Integer.parseInt(text));
		}
		catch (NumberFormatException e){
			System.out.println("NumberFormatException => " + e.getMessage());
		}
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
	    
	//	generateExpection();
		
		handleExpection();
		
		
		
		
		

		
	}
}