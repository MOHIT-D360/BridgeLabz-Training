import java.util.Scanner;
public class AgeHeightFinder{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		String [] friendName = {"Amar","Akbar","Anthony"};
		
		int[] age = new int [3];
		double[] height = new double[3];
		
		for(int i=0;i<3;i++){
			System.out.print("Enter age of friend " + (i+1) +" ");
			age[i] = sc.nextInt();
			
			System.out.print("Enter height of friend " + (i +1) +" ");
			height[i] = sc.nextDouble();
			
		}
		
		int tallestFriendIndex =-1;
		int youngesFriendIndex = -1;
		
		double tallestHeight = -1;
		int youngestAge = 999;
		for(int i=0;i<3;i++){
			if(height[i] > tallestHeight){
				tallestHeight = height[i];
				tallestFriendIndex = i;
				
			}
			
			if(age[i] < youngestAge){
				youngestAge = age[i];
				youngesFriendIndex =i;
			}
		}
		
		System.out.println("Youngest friend is " + friendName[youngesFriendIndex]); 
		System.out.println("tallest friend is " + friendName[tallestFriendIndex]);
		
		
	}
}