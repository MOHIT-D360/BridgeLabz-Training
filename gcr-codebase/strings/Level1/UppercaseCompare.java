import java.util.Scanner;

public class UppercaseCompare {
    public static String convertUpperCase(String str){
        String  upperStr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((int)ch>=97 && (int)ch<=122){
                ch = (char)((int)ch -32);
                upperStr += ch;
            }
        }
        return upperStr;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();  
      String tempStr = str1.toUpperCase();
      if(tempStr.equals(convertUpperCase(str1))){
          System.out.println("Both are equal");
      } else {
          System.out.println("Both are not equal");
      }

    }
}
