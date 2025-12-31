import java.util.Scanner;

public class TicketBooking{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String [][] details = new String[5][3];
		for(int i=0;i<5;i++){
			System.out.println("Select Movie type");
			System.out.println("------------------");
			System.out.println("press 1 : Horror");
			System.out.println("press 2 : Comedy");
			System.out.println("press 3 : Thriller");
			System.out.println("press 4 : Romantic");
			
			int option1 = sc.nextInt();
			switch(option1){
				
				case 1:
					details[i][0] = "Horror";
					break;
				case 2:
					details[i][0] = "Comedy";
					break;
				case 3:
					details[i][0]= "Comedy";
					break;
				case 4:
					details[i][0] = "Comedy";
					break;
				default:
					System.out.println("Invalid movie type");
					break;
					
				
			}
			
			System.out.println("Select Seat type");
			System.out.println("------------------");
			System.out.println("press 1 : gold");
			System.out.println("press 2 : silver");
			
			int option2 = sc.nextInt();
			
			
			if(option2 == 1){
				details[i][1] = "Gold";
			}
			else if(option2 == 2){
				details[i][1] = "Silver";
			}
			else{
				System.out.println("Invalid seat type");
			}
			System.out.println("Enter snack combo : 1.Popcorn 2.Coke 3.Nachos");
			int option3 = sc.nextInt();
			if(option3 == 1){
				details[i][2] = "Popcorn";
			}
			else if(option3 == 2){
				details[i][2] = "Coke";
			}
			else if(option3 == 3){
				details[i][2] = "Nachos";
			}
			else{
				System.out.println("Invalid snack combo");
			}
			
			
		}

		for(int i=0;i<details.length;i++){
			System.out.println("Booking Details for Ticket "+(i+1));
			System.out.println("----------------------------");
			System.out.println("Movie Type : "+details[i][0]);
			System.out.println("Seat Type  : "+details[i][1]);
			System.out.println("Snack Combo: "+details[i][2]);
			System.out.println();
		}
	}
}