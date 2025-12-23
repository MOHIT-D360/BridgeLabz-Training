import java.util.Scanner;

public class FreqCalculator {
     public static char[][] frequencyCalc(String s1){
        int[] charArray = new int[256];
        char[][] finalArray = new char[s1.length()][2];
        for(int i=0;i<s1.length();i++){
          int index=   (int)s1.charAt(i);
          charArray[index]++;
        }
        int index =0;
        for(int i=0;i<256;i++){
            if(charArray[i] >= 1){
                finalArray[index][0] = (char)i;
                finalArray[index][1] = (char)(charArray[i]+ '0');
                index++;
            }
        }
        return finalArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        
        char[][] charFreq = frequencyCalc(text);
        for(int i=0;i<text.length();i++){
            if(charFreq[i][0] != '\0'){
                System.out.println(charFreq[i][0] + " " + charFreq[i][1]);
            }
        }

    }
}
