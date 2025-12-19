import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the weight");
        double weight = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();

        double heightInM= height/100;

        double BMI= (weight /(heightInM*heightInM));
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
