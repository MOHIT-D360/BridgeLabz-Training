import java.util.Scanner;

public class SumInArray{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int [] arrValue = new int[10];
		System.out.print("Enter number");
		int index =0;
		int sum =0;
		
		while(true){
			int temp = sc.nextInt();
			if(temp>0 && index<10){
				arrValue[index] = temp;
				index++;
			}
			else{
				break;
			}
		}
		for(int i=0;i<index;i++){
			sum = sum + arrValue[i];
		}
		
		System.out.println("sum of all elements is "+sum);
			
		}
		
		
		
	}
 