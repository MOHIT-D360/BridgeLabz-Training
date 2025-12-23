import java.util.*;
public class VowerConsonant {
    public static String convertLowerCase(String s1){
        String temp = "";
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if((int)s1.charAt(i) >= 65 && (int)s1.charAt(i)<=91){
                c= (char)((int)c+32);
                temp += c;
            }


        }
        return temp;
    }
    public static int[] checkVowel(String s1){
        int[] countArr = new int[2];
        int vowelCount =0;
        int consonantCount =0;
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if((int)c>=97 && (int)c<=122){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        countArr[0] = vowelCount;
        countArr[1] = consonantCount;
        return countArr;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

       String lowerS1 =  convertLowerCase(s1);
       int[] resultArr = checkVowel(lowerS1);
         System.out.println("Vowels: " + resultArr[0]);
       System.out.println("Consonants: " + resultArr[1]);
    }
}
