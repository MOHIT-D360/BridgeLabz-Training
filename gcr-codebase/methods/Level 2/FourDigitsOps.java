import java.util.Scanner;   

public class FourDigitsOps {
        public static int[] generate4DigitRandomArray(int size){
            int[] randomArray = new int[size];
            for(int i=0;i<size;i++){
                int number = (int)(Math.random()*9000)+1000;
                randomArray[i] = number;
                
            }
            return randomArray;
        }
        public static double[] findAverageMinMax(int[] numbers) {
            double[] tempAvgMinMax = new double[3];
            int sum  =0;
            int min = numbers[0];
            int max = numbers[0];
            for(int i=0;i<numbers.length;i++){
                sum = sum + numbers[i];
                min = Math.min(min,numbers[i]);
                max = Math.max(max,numbers[i]);
            }
            tempAvgMinMax[0] = (sum/numbers.length);
            tempAvgMinMax[1] =  min;
            tempAvgMinMax[2] = max;
            return tempAvgMinMax;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a four-digit number: "+(int)(Math.random()*10000));
      int[] randomArray1 =  generate4DigitRandomArray(5);
      for(int i=0;i<5;i++){
        System.out.println(randomArray1[i]);
      }
      double[] AvgMinMax = findAverageMinMax(randomArray1);

       System.out.println("Average value = " + AvgMinMax[0]);
        System.out.println("Minimum value = " + (int)AvgMinMax[1]);
        System.out.println("Maximum value = " + (int)AvgMinMax[2]);


      
    }
}
