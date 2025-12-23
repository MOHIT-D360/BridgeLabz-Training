import java.util.Scanner;

public class LengthOfString {
    public static int findLength(String str){
	int index =0;
	boolean err = true;
	try{
		 while(err) {
			str.charAt(index);
			index ++;
		 }
	}
	catch(StringIndexOutOfBoundsException e){
	
		
		return index;
		
	}
	return index;

    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();  
      int length = findLength(str1);
	  
	  System.out.println("Length of String is :" + length);
	  


    }
}
