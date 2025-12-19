import java.util.Scanner;

public class Handle2dArray{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int [][] matrix = new int[3][3];
		System.out.print("Enter numbers");
		int [] oneDArray = new int[9];
		
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		int index =0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				oneDArray[index] = matrix[i][j];
				index++;
			}
		}
		
		
		for(int i=0;i<9;i++){
			System.out.print(oneDArray[i] + " ");
		}
		
			
		}
		
		
		
	}
 