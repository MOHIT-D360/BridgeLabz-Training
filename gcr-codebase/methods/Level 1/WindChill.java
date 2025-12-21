import java.util.Scanner;

public class WindChill
{

	public static double calculateWindChill(double temperature, double windSpeed)

{
	double result = 35.74 +  0.6215*temperature	+ ((0.475*temperature - 35.75) * (Math.pow(windSpeed,0.16)));
		return result;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  temperature :");
		double temperature = sc.nextDouble();
		
		System.out.println("Enter windSpeed :");
		double windSpeed = sc.nextDouble();
		
		
		
		double resultWindChill = calculateWindChill(temperature,windSpeed);
		
		
        System.out.println("Wind chill temperature is : " + resultWindChill);
        
		
		 
	}


}