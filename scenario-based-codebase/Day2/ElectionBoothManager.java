package Day2;
import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vote1 = 0, vote2 = 0, vote3 = 0;

        while (true) {
            System.out.println("\nEnter age (or -1 to exit): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

           // check
            if (age >= 18) {
                System.out.println("Eligible to vote");
                System.out.println("Enter your vote:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                int choice = sc.nextInt();

                if (choice == 1) {
                    vote1++;
                } else if (choice == 2) {
                    vote2++;
                } else if (choice == 3) {
                    vote3++;
                } else {
                    System.out.println("Invalid vote!");
                }

            } else {
                System.out.println("Not eligible to vote");
            }
        }

        
        System.out.println("Candidate A Votes: " + vote1);
        System.out.println("Candidate B Votes: " + vote2);
        System.out.println("Candidate C Votes: " + vote3);

        
    }
}
