import java.util.Scanner;

public class BMICalculator {

    public static String[][] calculateBMIStatus(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);

            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.5)
                status = "Underweight";
            else if (18.5 <= bmi && bmi <= 24.9)
                status = "Normal";
            else if (25.0 <= bmi && bmi < 39.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

    public static String[][] prepareBMIReport(double[][] data) {
        return calculateBMIStatus(data);
    }

    public static void displayBMIReport(String[][] report) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < report.length; i++) {
            System.out.println(
                    report[i][0] + "\t\t" +
                    report[i][1] + "\t\t" +
                    report[i][2] + "\t" +
                    report[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10 persons, column 0 = weight, column 1 = height
        double[][] inputData = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("\nPerson " + (i + 1) + " weight (kg): ");
            inputData[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " height (cm): ");
            inputData[i][1] = sc.nextDouble();
        }

        // Prepare BMI report
        String[][] bmiReport = prepareBMIReport(inputData);

        // Display report
        displayBMIReport(bmiReport);

        sc.close();
    }
}
