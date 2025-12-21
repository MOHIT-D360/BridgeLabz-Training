import java.util.Scanner;

public class BMIcalculator {
    public static double calculateBMI(double weight,double height){
        double heightInMeter = height/100;
        double BMI = weight/(heightInMeter*heightInMeter);
        return BMI;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] bmiData = new double[10][3];

        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    System.out.println("Enter weight of person "+i+" :");
                    bmiData[i][j] = sc.nextDouble();
                }
                else{
                    System.out.println("Enter height of person "+i+" :");
                    bmiData[i][j] = sc.nextDouble();
                }
            }
        }

        for(int i=0;i<10;i++){
           bmiData[i][2]= calculateBMI(bmiData[i][0],bmiData[i][1]);
        }
        for(int i =0;i<10;i++){
            System.out.println("");
            for(int j=0;j<3;j++){
                if(bmiData[i][2]<= 18.4){
                    System.out.println("BMI :"+ bmiData[i][2]+ " | weight :"+ bmiData[i][0]+ " | height "+ bmiData[i][1]+ " => Underweight");
                }
                else if(18.5 <= bmiData[i][2] && bmiData[i][2]<= 24.9){
                    System.out.println("BMI :"+ bmiData[i][2]+ " | weight :"+ bmiData[i][0]+ " | height "+ bmiData[i][1]+ " => Normal");
                }
                else if(25.0 <= bmiData[i][2] && bmiData[i][2]<= 29.9){
                    System.out.println("BMI :"+ bmiData[i][2]+ " | weight :"+ bmiData[i][0]+ " | height "+ bmiData[i][1]+ " => Overweight");
                }
                else{
                    System.out.println("BMI :"+ bmiData[i][2]+ " | weight :"+ bmiData[i][0]+ " | height "+ bmiData[i][1]+ " => Obese");
                }
            }
        }
    }
}
