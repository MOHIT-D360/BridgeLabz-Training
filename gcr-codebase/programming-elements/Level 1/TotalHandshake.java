import java.util.Scanner;

public class TotalHandshake{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	

	int studentCount ;
	System.out.println("enter number of student : ");
	studentCount = sc.nextInt();
	
	int HandshakeCount = (studentCount * (studentCount -1) )/2;
	
	
	
	System.out.println("Total number of handshake possible is " + HandshakeCount);
}
}