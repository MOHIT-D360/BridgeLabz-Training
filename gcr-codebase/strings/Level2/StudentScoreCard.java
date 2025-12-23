import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3]; 

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10; 
            scores[i][1] = (int)(Math.random() * 90) + 10; 
            scores[i][2] = (int)(Math.random() * 90) + 10; 
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {

        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    public static String[][] calculateGrades(double[][] results) {

        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 80)
                grades[i][0] = "A";
            else if (percentage >= 70 && percentage<= 79)
                grades[i][0] = "B";
            else if (percentage >= 60 && percentage<= 69)
                grades[i][0] = "C";
            else if (percentage >= 50 && percentage<= 59)
                grades[i][0] = "D";
            else if(percentage >= 40 && percentage<= 49)
                grades[i][0] = "E";
            else 
                 grades[i][0] = "R";
        }

        return grades;
    }

    public static void displayScoreCard(
            int[][] scores,
            double[][] results,
            String[][] grades) {

        System.out.println(
            "\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int)results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t" +
                grades[i][0]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generatePCMScores(students);

        double[][] results = calculateResults(scores);

        String[][] grades = calculateGrades(results);

        displayScoreCard(scores, results, grades);

        sc.close();
    }
}
