import java.util.Scanner;

public class ArrayIndexOutOfBounds {

	public static void generateExpection(){
		Scanner sc = new Scanner(System.in);
		int[] text = new int[5];
		for(int i=0;i<=5;i++){
			text[i] = sc.nextInt();
		}
		System.out.println(text[10]);
		
		
	}
	public static void handleExpection(){
		Scanner sc = new Scanner(System.in);
		int[] text = new int[5];
		
		
		try{
			for(int i=0;i<=5;i++){
				text[i] = sc.nextInt();
			}
			System.out.println(text[10]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException => " + e.getMessage());
		}
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
	    
	//	generateExpection();
		
		handleExpection();
		
		
	}
}