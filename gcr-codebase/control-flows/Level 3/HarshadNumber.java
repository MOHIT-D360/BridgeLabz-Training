import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

       int cpyNumber = number;
       int sum = 0;
       while(cpyNumber>0){
        int digit = cpyNumber%10;
        sum = sum + digit;
        cpyNumber = cpyNumber/10;
       }

       if(number%sum ==0){
            System.out.println("yes it is harshad's number");
       }
       else{
            System.out.println("no is not a harshasd's number");
       }
    }
}
