import java.util.Scanner;
public class LargestSecondLargestDigitDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int number = sc.nextInt();

        int maxDigit =10;
        int[] digitArray = new int[maxDigit];

        int index =0;
        while(number !=0){
            if(index == maxDigit){
                maxDigit = maxDigit +10;
                int[] temp = new int[maxDigit];
                for(int i=0;i<index;i++){
                    temp[i] = digitArray[i];
                }
                digitArray =temp;
            }
            digitArray[index] = number %10;
            index ++;
            number = number /10;
        }

        int largest =0;
        int secondLargest =0;
        for(int i=0;i<index;i++){
            if(digitArray[i]>largest){
                secondLargest = largest;
                largest = digitArray[i];
            }
            else if(digitArray[i]>secondLargest && largest != digitArray[i]){
                secondLargest = digitArray[i];
            }
        }

        System.out.println("Largest digit is "+ largest);
        System.out.println("Largest digit is "+ secondLargest);
    }
}
