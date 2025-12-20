import java.util.Scanner;

public class BmiCalculatorArray {
    public static void main(String[] args) {
        System.out.print("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();

        double[] weight = new double[person];
        double[] height = new double[person];

        double[] BMI = new double[person];

        for(int i=0;i<person;i++){
            System.out.print("Enter weight of person ");
            double tempWeight = sc.nextDouble();
            System.out.print("Enter height of person ");
            double tempHeight = sc.nextDouble();
            if(tempWeight>0 && tempHeight>0){
                weight[i] = tempWeight;
                height[i] = tempHeight;

            }
        }
        for(int i=0;i<person;i++){
            BMI[i] = weight[i]/(height[i]*height[i]);
        }
        String[] category = {"Underweight", "Normal", "Overweight", "Obesity"};
        for(int i=0;i<person;i++){
            System.out.print("BMI of person "+ (i+1) + " is: " + BMI[i]);
            if(BMI[i]<18.5){
                System.out.println(" Category: " + category[0]);
            }
            else if(BMI[i]>=18.5 && BMI[i]<24.9){
                System.out.println(" Category: " + category[1]);
            }
            else if(BMI[i]>=25 && BMI[i]<29.9){
                System.out.println(" Category: " + category[2]);
            }
            else if(BMI[i]>=30){
                System.out.println(" Category: " + category[3]);
            }
        }
    }
}
