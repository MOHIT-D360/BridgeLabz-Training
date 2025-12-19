import java.util.Scanner;

public class GreatestFactor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        int greatestFactor = -1;

        for(int i=1;i<=(number/2);i++){
            if(number%i ==0){
              if(greatestFactor<i){
                greatestFactor = i;
              }

            }}
            System.out.println("Greatest factor of number "+ number+ " is "+greatestFactor);
        }
}
