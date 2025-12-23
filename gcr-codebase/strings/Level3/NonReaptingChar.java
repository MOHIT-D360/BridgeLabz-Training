import java.util.Scanner;

public class NonReaptingChar {
    public static char nonReaptingChar(String s1){
        int[] charArray = new int[256];
        for(int i=0;i<s1.length();i++){
          int index=   (int)s1.charAt(i);
          charArray[index]++;
        }
        for(int i=0;i<256;i++){
            if(charArray[i] == 1){
                return (char)i;
            }
        }
        return '\0' ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        
        char ch = nonReaptingChar(text);
        System.out.println(ch);
    }
}
