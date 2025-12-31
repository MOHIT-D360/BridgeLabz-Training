import java.util.Scanner;

public class TemperatureLogger {
    public static void main(String[] args) {
        double[] temperatureArr = new double[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperatures of one week");
        System.out.println("_________________________________");
        System.out.println();
        for(int i=0;i<temperatureArr.length;i++){
            System.out.println("Enter temperature of Day :"+(i+1));
            temperatureArr[i] = sc.nextDouble();
        }
        System.out.println();
        System.out.println("_________________________________");
        double avgTemp = 0;
        double max = -1;
        for(int i=0;i<temperatureArr.length;i++){
            avgTemp += temperatureArr[i];
            if(temperatureArr[i]>max){
                max = temperatureArr[i];
            }
        }
        System.out.println("Average Temperature is :" + avgTemp);
        System.out.println("Maximum  Temperature is :" + max);


    }
}
