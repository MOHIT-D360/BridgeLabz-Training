import java.util.Scanner;

public class DigitsCounter {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount =0;

        while(number>0){

            digitCount++;
            number = number/10;
        }
        System.out.println("total digit is "+digitCount);
     }
}
