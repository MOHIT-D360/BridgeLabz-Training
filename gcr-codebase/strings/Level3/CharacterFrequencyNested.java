import java.util.Scanner;

public class CharacterFrequencyNested {

    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int n = chars.length;

        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[i] = 1;
        }

        for (int i = 0; i < n; i++) {

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequencyResult = findCharacterFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (String entry : frequencyResult) {
            System.out.println(entry);
        }

    }
}
