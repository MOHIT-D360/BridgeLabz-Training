import java.util.Scanner;

public class SimpleIntrest{

	public static void SI(int principle,int rate,int time ){
	
		int simpleIntrest = (principle*rate*time)/100;
		System.out.println("The Simple Interest is" + simpleIntrest +" for Principal " + principle+ " Rate of Interest "+ rate + " and Time" +time);
	
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle :");
		int principle = sc.nextInt();
		System.out.println("Enter rate :");
		int rate = sc.nextInt();
		System.out.println("Enter time :");
		int time = 	sc.nextInt();
		SI(principle,rate,time);
		
	}

}