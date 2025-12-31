import java.util.Scanner;

public class BusAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] students = new String[10][2];
        int totalPresent =0;
        int totalabsent =0;
        System.out.println("Enter Name of 10 Student.");
        System.out.println("___________________________________");
        for(int i=0;i<10;i++){
            System.out.println("Enter name of student "+ (i+1));
            students[i][0] = sc.nextLine();
        }

        System.out.println("Mark present or absent use 'p' for present and 'a' for absent ");
        for(int i=0;i<10;i++){
            String tempAttendance = sc.next().toLowerCase();
            System.out.print("Is "+students[i][0]+" present or absent ?     ");
            if(tempAttendance.equals("p") || tempAttendance.equals("a")){
                students[i][1] = tempAttendance;
            }
            else{
                System.out.println("Invalid input , please enter 'p' or 'a' ");
                i--;
            }


        }
        System.out.println("___________________________________");
        System.out.println("Student Attendance Record ");
       for (String[] student : students) {
    System.out.printf("%s  :   %s",student[0],  student[1].equals("p") ? "Present" : "Absent");
    System.out.println();
}
        for(int i=0;i<10;i++){
            if(students[i][1].equals("p")){
                totalPresent++;
            }
            else{
                totalabsent++;
            }
        }
        System.out.println("___________________________________");
        System.out.println("Total Present Students  : "+ totalPresent); 
        System.out.println("Total Absent Students  : "+ totalabsent);
    }
}
