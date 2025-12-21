import java.util.Scanner;
public class TrigonometricFunctions{
	
	public static double[] calculateTrigonometricFunctions(double angle){
		double angleInRadian = Math.toRadians(angle);
		
		double sin = Math.sin(angleInRadian);
		double cosine = Math.cos(angleInRadian);
		double tan = Math.tan(angleInRadian);
			
			double[] result = new double [3];
			result[0] = sin;
			result[1] = cosine;
			result[2] = tan;
			
			return result;
		
	}
	
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter angle in degrees :");
		double angle = sc.nextDouble();
		
		double [] values =   calculateTrigonometricFunctions(angle);
		
		System.out.print("Sine :"+ values[0]);
		System.out.print("Cosine :"+ values[1]);
		System.out.print("tan :"+ values[2]);
		
	}
}