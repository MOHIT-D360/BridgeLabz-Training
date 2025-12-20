import java.util.Scanner;
public class GradePercentage{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number :");
		int number = sc.nextInt();
		
		int[] marks = new int[number];
		int[] percentage = new int[number];
		
		char[] grade = {'A','B','C','D','E','R'};
		
		
		for(int i=0;i<number;i++){
		
			System.out.print("Enter maths marks:");
			int mathsMarks = sc.nextInt();
			System.out.print("Enter physics marks :");
			int physicsMarks = sc.nextInt();
			System.out.print("Enter chemistry marks :");
			int chemistryMarks = sc.nextInt();
		
			if(mathsMarks<0 && physicsMarks<0 && chemistryMarks<0){
				System.out.print("Invalid marks enter again for student "+ i+" : ");
				i--;
			}
			else{
				int totalMarks = mathsMarks+ physicsMarks+chemistryMarks;
				marks[i] = totalMarks;
			}
			
		}
		for(int i=0;i<number;i++){
			percentage[i] = (marks[i]/3);
			if(percentage[i]>=80){
				System.out.println("Marks :"+marks[i]+" percentage :"+percentage[i] + "grade :"+ grade[0]);
			}
			else if(percentage[i]>=70 && percentage[i]<=79){
				System.out.println("Marks :"+marks[i]+" percentage :"+percentage[i] + "grade :"+ grade[1]);
			}
			else if(percentage[i]>=60 && percentage[i]<=69){
				System.out.println("Marks :"+marks[i]+" percentage :"+percentage[i] + "grade :"+ grade[2]);
			}
			else if(percentage[i]>=50 && percentage[i]<=59){
				System.out.println("Marks :"+marks[i]+" percentage :"+percentage[i] + "grade :"+ grade[3]);
			}
			else if(percentage[i]>=40 && percentage[i]<=49){
				System.out.println("Marks :"+marks[i]+" percentage :"+percentage[i] + "grade :"+ grade[4]);
			}
			else if(percentage[i]	<=39){
				System.out.println("Marks :"+marks[i]+" percentage :"+percentage[i] + "grade :"+ grade[5]);
			}
		}
	}
}