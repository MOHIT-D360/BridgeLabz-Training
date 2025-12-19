import java.util.Scanner;

public class FactorFinderForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();
        int i=1;
        while(i<= (number/2)){
             if(number%i ==0){
                System.out.print(i+" ");
            }
            i++;
        }

    }
}
