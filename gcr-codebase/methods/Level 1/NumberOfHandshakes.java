import java.util.Scanner;

public class NumberOfHandshakes{

	public static void handShakes(int students ){
	
		int totalHandshake = (students * (students -1))/2;
		System.out.println("The number of possible handShakes is :" +totalHandshake);
	
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of students :");
		int students = sc.nextInt();

		handShakes(students);
		
	}

}