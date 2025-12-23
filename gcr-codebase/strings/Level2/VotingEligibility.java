import java.util.Scanner;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 10;
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            // validate age
            if (ages[i] < 0) {
                result[i][1] = "false";
            } 
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            } 
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            int age = Integer.parseInt(data[i][0]);
            boolean canVote = Boolean.parseBoolean(data[i][1]);

            System.out.println(age + "\t" + canVote);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        String[][] votingData = checkVotingEligibility(ages);

       
        displayResult(votingData);

        sc.close();
    }
}
