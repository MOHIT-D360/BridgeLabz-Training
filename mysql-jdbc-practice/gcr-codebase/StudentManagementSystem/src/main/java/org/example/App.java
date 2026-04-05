package org.example;
import java.util.*;
public class App {
  private static StudentDAO stu = new StudentDAO();
  private static Scanner sc = new Scanner(System.in);
  private static void displayMenu() {
    System.out.println("\n===== Student Management System =====");
    System.out.println("1. Add New Student");
    System.out.println("2. View All Students");
    System.out.println("3. View Student by ID");
    System.out.println("4. Update Student");
    System.out.println("5. Delete Student");
    System.out.println("6. Exit");
    System.out.print("Enter your choice: ");
  }
  private static void addStudent(){
    System.out.println("Enter id:");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter name:");
    String name = sc.nextLine();
    System.out.println("Enter email:");
    String email = sc.nextLine();
    System.out.println("Enter age:");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter grade:");
    String grade = sc.nextLine();
    StudentDTO student = new StudentDTO(id,name,email,age,grade);
    stu.insertStudent(student);
  }
  private static void allStudent(){
    List<StudentDTO> l1 = stu.getAllStudent();
    for(StudentDTO s :l1){
      System.out.println(s);
    }
  }
  private static void getStudentById(){
    System.out.println("Enter id:");
    int id = sc.nextInt();
    sc.nextLine();
    StudentDTO s = stu.getStudentById(id);
    System.out.println(s);
  }
  private static void updateStudent(){
    System.out.println("Enter id:");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter name:");
    String name = sc.nextLine();
    System.out.println("Enter email:");
    String email = sc.nextLine();
    System.out.println("Enter age:");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter grade:");
    String grade = sc.nextLine();
    StudentDTO student = new StudentDTO(id,name,email,age,grade);
    if(stu.updateStudent(student)){
      System.out.println("Updated....");
    }
    else{
      System.out.println("failed to update");
    }
  }
  private  static  void deleteStudent(){
    System.out.println("Enter id");
    int id = sc.nextInt();
    sc.nextLine();
    if(stu.deleteStudent(id)){
      System.out.println("Student deleted..");
    }
    else{
      System.out.println("not deleted");
    }
  }
  public static void main(String[] args) {


    boolean running = true;
    while(running){
      displayMenu();
      int choice = sc.nextInt();
      sc.nextLine();
      switch (choice){
        case 1 : addStudent(); break;
        case 2 : allStudent(); break;
        case 3 : getStudentById(); break;
        case 4 : updateStudent(); break;
        case 5 : deleteStudent(); break;
        case 6 : running = false; break;
        default: System.out.println("Invalid choice");
      }
    }

  }
}
