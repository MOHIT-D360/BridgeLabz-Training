import java.util.Scanner;

public class WordSplitMin {
    public static String[] splitWord(String text){
        int count = 1;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == ' '){
                count++;
            }
        }
        String [] temp = new String[count];
        int start=0;
        int wordIndex =0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == ' '){
                temp[wordIndex] = text.substring(start, i);
                wordIndex++;
                start = i+1;
            }
        }
        temp[wordIndex] = text.substring(start);
        return temp;
    }

    public static int lengthFinder(String s1){
        int count =0;
        for(char c : s1.toCharArray()){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String [] words = splitWord(text);

        int maxLength =-1;
        int maxIndex =0;
        int minLength = 299;
        int minIndex =0;

        for(int i=0;i<words.length;i++){
            int tempLength = lengthFinder(words[i]);
            if(maxLength<tempLength){
                maxLength = tempLength;
                maxIndex = i;
            }
            if(minLength>tempLength){
                minLength = tempLength;
                minIndex = i;
            }
        }

        System.out.println("Max length is :"+ maxLength+ " and word is :"+ words[maxIndex]);
        System.out.println("Min length is :"+ minLength+ " and word is :"+ words[minIndex]);

    }
}