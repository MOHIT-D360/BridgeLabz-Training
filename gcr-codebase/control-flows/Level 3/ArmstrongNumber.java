import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int tempNumber = number;

        int sum = 0;
        int digits = 0;

   
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digits++;
        }

        tempNumber = number;

  
        while (tempNumber != 0) {
            int digit = tempNumber % 10;

            sum = sum + (int) Math.pow(digit, digits);

            tempNumber = tempNumber / 10;
        }

     
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }

       
    }
}
