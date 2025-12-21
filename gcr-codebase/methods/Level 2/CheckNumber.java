import java.util.Scanner;

public class CheckNumber {
    public static  boolean isPositive(int number){
        if(number >0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
           return false;
        }

    }
    public static void compare(int number1,int number2){
        if(number1>number2){
            System.out.println("Greater");
        }
        else if(number1<number2){
            System.out.println("Smaller");
        }
        else{
            System.out.println("Equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[5];

        for(int i=0;i<5;i++){
            System.out.print("Enter number "+ i+ " :");
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(isPositive(numbers[i])){
            System.out.println(numbers[i] + " is positive");
        }
        else{
            System.out.println(numbers[i] + " is not positive");
        } 
        }
        for(int i=0;i<5;i++){
            if(isEven(numbers[i])){
                System.out.println( numbers[i] + " is even");
            }
            else{
                System.out.println( numbers[i] + " is odd");
            }
        }
        
            compare(numbers[0],numbers[5-1]);
        
    }
}
