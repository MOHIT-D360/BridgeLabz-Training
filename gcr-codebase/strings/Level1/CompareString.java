import java.util.Scanner;

public class CompareString {

	public static boolean isEqual(String s1,String s2){
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
		}
        return true;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String s1 = sc.next();
		System.out.println("Enter String 2 :");
		String s2 = sc.next();
		
		System.out.println(isEqual(s1, s2));
		
		
		
	}
}