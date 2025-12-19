import java.util.Scanner;

public class MultipleFinderWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();
    
        if(number>0&&number<=100){

            int i=100;
            while(i>=number){
                 if(i%number ==0){
                    System.out.print(i+ " ");
                }
                i--;
            }
            }
            

        }
}
