import java.util.Scanner;

public class AvgMarksCalculator {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter Maths Marks :");
        int mathMarks = sc.nextInt();
        System.out.println("Enter Physics Marks :");
        int physicsMarks = sc.nextInt();
        System.out.println("Enter Chemistry Marks :");
        int chemistryMarks = sc.nextInt();

        int avgMarks = (mathMarks + physicsMarks + chemistryMarks)/3;

        if(avgMarks>=80){
            System.out.println("Your grade : A, above ageny-normalized standards and marks is "+ avgMarks);
        }
        else if(avgMarks>=70&&avgMarks<=79){
          System.out.println("Your grade : B, at ageny-normalized standards and marks is "+ avgMarks);
        }
        else if(avgMarks>=60&&avgMarks<=69){
          System.out.println("Your grade : C, below, but approaching ageny-normalized standards and marks is "+ avgMarks);
        }
        else if(avgMarks>=50&&avgMarks<=59){
          System.out.println("Your grade : D, well below ageny-normalized standards and marks is "+ avgMarks);
        }
        else if(avgMarks>=40&&avgMarks<=49){
          System.out.println("Your grade : E, too below ageny-normalized standards and marks is "+ avgMarks);
        }
        else if(avgMarks<=39){
          System.out.println("Your grade : R, Remedial standards and marks is "+ avgMarks);
        }


        

       


    }
}
