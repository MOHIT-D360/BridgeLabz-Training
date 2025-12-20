import java.util.Scanner;

public class BmiCalculator2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number =sc.nextInt();

        double [][] personData = new double[number][3];
        String[] category = {"Underweight", "Normal", "Overweight", "Obesity"};
        double[] BMI = new double[number];

        for(int i=0;i<number;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    personData[i][j] = sc.nextDouble();
                }
                else{
                    personData[i][j] = sc.nextDouble();
                }
            }
        }
        for(int i=0;i<number;i++){
            BMI[i] = personData[i][0]/(personData[i][1] * personData[i][1]);
            if(BMI[i]<18.5){
                personData[i][2] = 0;
            }
            else if(BMI[i]>=18.5 && BMI[i]<24.9){
                personData[i][2] = 1;
            }
            else if(BMI[i]>=25 && BMI[i]<29.9){
                personData[i][2] = 2;
            }
            else if(BMI[i]>=30){
                personData[i][2] = 3;
            }
        }
        for(int i=0;i<number;i++){
            System.out.print("BMI of person "+ (i+1) + " is: " + BMI[i]);
            System.out.println(" Category: " + category[(int)personData[i][2]]);
        }
    }
}
