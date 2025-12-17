import java.util.Scanner;
class CelciusToFahrenheit {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
	int temp;
	System.out.println("enter temperature in celcius: ");
	temp = sc.nextInt();
	float result = (temp * (9/5)) +32;
	System.out.println("temperature is " + result);
	
	
	}
}