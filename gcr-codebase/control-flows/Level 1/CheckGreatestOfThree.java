import java.util.Scanner;

public class CheckGreatestOfThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers :");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		if (number1 >= number2 && number1 >= number3) {
			System.out.println("Is the first number the largest? yes");
			System.out.println("Is the second number the largest? no");
			System.out.println("Is the third number the largest? no");
}
		else if (number2 >= number1 && number2 >= number3) {
			System.out.println("Is the first number the largest? no");
			System.out.println("Is the second number the largest? yes");
			System.out.println("Is the third number the largest? no");
}
		else {
			System.out.println("Is the first number the largest? no");
			System.out.println("Is the second number the largest? no");
			System.out.println("Is the third number the largest? yes");
}
		
	}
}