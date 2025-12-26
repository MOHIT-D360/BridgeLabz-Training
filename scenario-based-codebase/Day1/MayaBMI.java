package Day1;
import java.util.Scanner;

public class MayaBMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input 
        System.out.println("Enter height :");
        double height= sc.nextDouble();
        System.out.println("Enter weight :");
        double weight= sc.nextDouble();

        double BMI = weight/(height*height);
        //showing results 
         if(BMI<=18.4){
            System.out.println("Underweight :"+BMI);
        }
        else if(BMI>=18.5 && BMI<=24.9){
             System.out.println("Normal :"+BMI);
        }
        else if(BMI>=25.0 && BMI<=39.9){
             System.out.println("overweight :"+BMI);
        }
        else if(BMI>=40.0){
             System.out.println("obese :"+BMI);
        }

    }
}