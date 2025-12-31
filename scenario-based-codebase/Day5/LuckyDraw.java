import java.util.Scanner ;
public class LuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isStop= true;

        while(isStop){
            System.out.println("Enter number :");
            int number = sc.nextInt();
            if(number % 3 ==0 && number %5 ==0){
                System.out.println("You are very lucky  you win !");
                isStop = false;
            }



        }
    }
}
