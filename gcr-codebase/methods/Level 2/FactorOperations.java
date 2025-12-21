import java.util.Scanner;
import java.lang.Math;

public class FactorOperations {

    public static int[] factorFinder(int number){
        int[] factorArray = new int[(number/2)+1];
        int index =0;
        for(int i=1;i<=number/2;i++){
            if(number %i ==0){
                factorArray[index] = i;
                index++; 
            }
        }
        return factorArray;
    }

    public static int sumOfFactors(int[] factorArray){
        int sum =0;
        for(int i=0;i<factorArray.length;i++){
            sum  = sum + factorArray[i];
        }
        return sum;

    }
    public static int productOfFactor(int[] factorArray){
        int product =1;
        for(int i=0;i<factorArray.length;i++){

            if(factorArray[i] !=0){
                product = product* factorArray[i];
            }
           
        }
        return product;
    }
    public static double sumOfSquaresFactor(int[] factorArray){
        double sumOfSquares =0;
        for(int i=0;i<factorArray.length-1;i++){
            sumOfSquares = sumOfSquares + Math.pow(factorArray[i],2);
        }
        return sumOfSquares;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();

      int[] factorArray =   factorFinder(number);
      int factorArraySum = sumOfFactors(factorArray);
      int factorArrayProduct = productOfFactor(factorArray);
      double sumOfSquares =  sumOfSquaresFactor(factorArray);

      for(int i=0;i<factorArray.length;i++){
          if(factorArray[i] !=0){
              System.out.print(factorArray[i] + " ");
          }
      }
        System.out.println("\nSum of factors :" + factorArraySum);
        System.out.println("Product of factors :" + factorArrayProduct);
        System.out.println("Sum of squares of factors :" + sumOfSquares);

    }
}
