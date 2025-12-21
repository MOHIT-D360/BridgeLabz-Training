import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age){
        if(age >=18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int[] ageArray = new int[10];
        
        for(int i=0;i<10;i++){

              System.out.print("Enter  age  "+ (i+1)+ " :");
            ageArray[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(canStudentVote(ageArray[i])){
                System.out.println("Yes person "+i+"can vote");
            }
            else{
                System.out.println("No person "+i+" cannot vote");
        }

    }
}
}
