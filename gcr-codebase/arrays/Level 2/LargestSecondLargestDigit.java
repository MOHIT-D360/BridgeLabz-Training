import java.util.Scanner;
public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digitArray = new int[maxDigit];
        int index =0;
        while(number !=0 ){
            if(index == maxDigit){
                break;  
            }
            digitArray[index] = number %10;
            index++;
            number  = number /10;
        }

        int largest =0;
        int secondLargest =0;

        for(int i=0;i<index;i++){
            if(digitArray[i]>largest){
                secondLargest = largest;
                largest = digitArray[i];
            }
            else if(digitArray[i]>secondLargest && digitArray[i] != largest){
                secondLargest = digitArray[i];
            }

        }

        System.out.println("Largest digit is " + largest);
        System.out.println("Second largest digit is " + secondLargest);

    }
}
