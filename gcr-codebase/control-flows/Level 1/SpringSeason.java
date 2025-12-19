public class SpringSeason{
	public static void main(String[] args){
		int month = Integer.parseInt(args[0]);
		int date = Integer.parseInt(args[1]);
		
		boolean isSpring = ((month == 3 && date >= 20) || (month == 4) || (month == 5) || (month == 6 && date<= 20));
			
			
		if(isSpring){
			System.out.println("Its a spring season");
			
		}
		else{
			System.out.println("Not a spring season");
		}
		
	}
}