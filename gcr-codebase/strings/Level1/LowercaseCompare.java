import java.util.Scanner;

public class LowercaseCompare {
    public static String convertLowerCase(String str){
        String  lowerStr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((int)ch>=65 && (int)ch<=92){
                ch = (char)((int)ch +32);
                lowerStr += ch;
            }
			else{
				lowerStr += ch;
			}
        }
        return lowerStr;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();  
      String tempStr = str1.toLowerCase();
	  System.out.println(tempStr);
      if(tempStr.equals(convertLowerCase(str1))){
		  
          System.out.println("Both are equal");

      } else {
          System.out.println("Both are not equal");
		  
      }

    }
}
