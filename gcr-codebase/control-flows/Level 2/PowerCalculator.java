import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Enter power");
        int power = sc.nextInt();

        int powerResult = 1;

        for(int i=0;i<power;i++){
            powerResult = powerResult*number;
        }
        System.out.println(number+" to the power "+ power + " is "+  powerResult);
        }
}
