import java.util.Scanner;

public class SplitString {

    public static String[] splitWords(String text) {

        // count words
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] temp = new String[count];

        int index = 0;      
        int wordIndex = 0; 

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                temp[wordIndex] = text.substring(index, i);
                wordIndex++;
                index = i + 1;
            }
        }

        // last word
        temp[wordIndex] = text.substring(index);

        return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to split:");
        String text = sc.nextLine();

        String[] splitArray = splitWords(text);

        System.out.println("Manual split:");
        for (String word : splitArray) {
            System.out.println(word);
        }

        String[] words = text.split(" ");

        boolean isEqual = true;

        if (words.length != splitArray.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals(splitArray[i])) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("The split arrays are equal.");
        } else {
            System.out.println("The split arrays are not equal.");
        }

        sc.close();
    }
}
