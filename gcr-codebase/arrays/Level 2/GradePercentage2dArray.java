import java.util.Scanner;

public class GradePercentage2dArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3];
        int[][] percentageAndGrade = new int[number][2];

        char[] grade = {'A','B','C','D','E','R'};

        
        for(int i=0;i<number;i++){
            System.out.println("Enter marks for Student " + (i+1));
            for(int j=0;j<3;j++){
                int mark = sc.nextInt();
                if(mark < 0 || mark > 100){
                    System.out.println("Invalid mark! Enter again:");
                    j--;
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        
        for(int i=0;i<number;i++){
            int total = 0;
            for(int j=0;j<3;j++){
                total += marks[i][j];
            }

            int percentage = total / 3;
            percentageAndGrade[i][0] = percentage;

            if(percentage >= 80) percentageAndGrade[i][1] = 0;
            else if(percentage >= 70) percentageAndGrade[i][1] = 1;
            else if(percentage >= 60) percentageAndGrade[i][1] = 2;
            else if(percentage >= 50) percentageAndGrade[i][1] = 3;
            else if(percentage >= 40) percentageAndGrade[i][1] = 4;
            else percentageAndGrade[i][1] = 5;
        }

       
        for(int i=0;i<number;i++){
            System.out.print("Student " + (i+1) + " marks: ");
            for(int j=0;j<3;j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println("  Percentage: " + percentageAndGrade[i][0]
                    + "  Grade: " + grade[percentageAndGrade[i][1]]);
        }

      
    }
}
