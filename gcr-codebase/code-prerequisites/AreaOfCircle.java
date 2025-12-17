import java.util.Scanner;
class AreaOfCircle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int radius;
		System.out.println("Enter the radius of a circle: ");
		radius = sc.nextInt();
		System.out.println("Area of Circle is :" + (3.14 * radius * radius));
		
		
	
	}
}