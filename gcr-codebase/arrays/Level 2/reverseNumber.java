import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        int[] digitArray = new int[10];
        int index =0;
        while(number !=0) {
            if(index == 10){
                break;
            }
            digitArray[index] = number%10;
            index++;
            number = number/10;
        }

        for(int i=0;i<index;i++){
            System.out.print(digitArray[i]);
        }
    }
}
