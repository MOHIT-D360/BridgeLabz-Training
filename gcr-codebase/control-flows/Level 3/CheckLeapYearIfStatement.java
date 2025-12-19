import java.util.Scanner;

public class CheckLeapYearIfStatement {
          

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year :");
        int year = sc.nextInt();

        if(year<1582){
            System.out.println("year must be greater than 1582");
        }
        else{
             if(year%400 ==0 || year%4 == 0 && year%100 !=0 ){
            System.out.println(year +" is a leap year");
        }
        else{
             System.out.println(year +" is not a leap year");
        }
        }


    }
}
