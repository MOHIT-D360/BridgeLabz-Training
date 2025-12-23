import java.util.Scanner;

public class WordLength2DArray {

    
    public static String[] splitWords(String text) {

        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count];
        int start = 0;
        int wordIndex = 0;

       
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }

      
        words[wordIndex] = text.substring(start);

        return words;
    }

    
    public static int findLength(String word) {
        int count = 0;

        for (char c : word.toCharArray()) {
            count++;
        }

        return count;
    }

   
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = sc.nextLine();

        
        String[] words = splitWords(text);

       
        String[][] wordLengthArray = createWordLengthArray(words);

       
        System.out.println("\nWord\tLength");
        

        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}
