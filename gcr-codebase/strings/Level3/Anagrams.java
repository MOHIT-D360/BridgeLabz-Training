import java.util.Scanner;

public class Anagrams {

    public static boolean checkAnagram(String text1,String text2){
        if(text1.length() != text2.length()){
			return false;
		}
		int[] freqText1 = new int[256];
		int[] freqText2 = new int[256];
		
		for(int i=0;i<text1.length();i++){
			int index = (int)text1.charAt(i);
			freqText1[index]++;
			index = (int)text2.charAt(i);
			freqText2[index]++;
		}
		for(int i=0;i<freqText1.length;i++){
			if(freqText1[i] != freqText2[i]){
				return false;
			}
		}
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  strings 1 to check for Anagrams:");
        String  text1 = sc.nextLine();
        System.out.println("Enter  strings 2 to check for Anagrams:");
        String text2 = sc.nextLine();

        if(checkAnagram(text1,text2)){
            System.out.println("Anagrams");}
        else{
            System.out.println("Not Anagrams");}
    }
}
