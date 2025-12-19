import java.util.Scanner;

public class CheckVotingAge{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int [] studentAge = new int[10];
		System.out.print("Enter Student's age");
		for(int i=0;i<10;i++){
			studentAge[i] = sc.nextInt();
			
		}
		for(int i=0;i<10;i++){
			if(studentAge[i]>=18){
			System.out.println("The Student with the age "+ studentAge[i]+ " can vote");
			}
			else if(studentAge[i]<0){
			System.out.println("Invalid age");
			}
			else{
				System.out.println("The Student with the age "+ studentAge[i]+ " cannot vote");
			}
		}
		
		
		
	}
}