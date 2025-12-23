import java.util.Scanner;

public class CheckCharArrayMethod {
 public static char[] makeCharArray(String s1){
	char[] tempArr = new char[s1.length()];
	for(int i=0;i<s1.length();i++){
		tempArr[i] = s1.charAt(i);
	}
	return tempArr;
 }
	
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String s1 = sc.next();
		
		char[] characterArray = makeCharArray(s1);
		char[] characterArray2 = s1.toCharArray();
		String isEqual = "equal";
		
		for(int i=0;i<s1.length();i++){
			if(characterArray.length != characterArray2.length){
				isEqual = "not equal";
				
				break;
			}
			else {
				if(characterArray[i] != characterArray2[i]){
					isEqual = "not equal";
					break;
				}
			}
		}
		System.out.println(isEqual);
	}
}