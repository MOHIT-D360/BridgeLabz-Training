import java.util.Scanner;

public class SubstringComparison {

    public static String subStringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static String subStringUsingSubstring(String mainString, int start, int end) {
        return mainString.substring(start, end);
    }   
    public static boolean isEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();
        System.out.println("Enter the start index:");
        int start = sc.nextInt();
        System.out.println("Enter the end index:");
        int end = sc.nextInt();

        String subStringUsingCharAt = subStringUsingCharAt(mainString,start,end);
        String subStringUsingSubstring =subStringUsingSubstring(mainString,start, end);
        if(isEqual(subStringUsingCharAt, subStringUsingSubstring)){
            System.out.println("The substrings are equal: " + subStringUsingCharAt);
        } else {
            System.out.println("The substrings are not equal.");
        }
    }
}
