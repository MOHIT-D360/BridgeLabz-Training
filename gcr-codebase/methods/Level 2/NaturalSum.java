import java.util.Scanner;

public class NaturalSum {

    public static int sumCalculator(int number){
        if(number == 1){
            return 1;
        }
        return number + sumCalculator(number-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if(number < 1){
            System.out.println("Please enter a valid natural number.");
            return;

          
        }
        else{
            int result = sumCalculator(number);
            System.out.println("The sum of first " + number + " natural numbers is: " + result);
        }
    }
}
