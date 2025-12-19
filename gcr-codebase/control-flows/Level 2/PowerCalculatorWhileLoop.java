import java.util.Scanner;

public class PowerCalculatorWhileLoop {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Enter power");
        int power = sc.nextInt();

        int powerResult = 1;

        int i =0;
        while(i<power){
               powerResult = powerResult*number;
                 i++;
        }

       
        System.out.println(number+" to the power "+ power + " is "+  powerResult);
        }
}
