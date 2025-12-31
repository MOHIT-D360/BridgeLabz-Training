import java.util.Scanner;

public class NumberGuessingGame {
    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        int lowerBond = 1;
        int upperBond =100;
        int limit =5;
        boolean gamePlay = true;
        int comGuess = (int)(Math.random()*(upperBond-lowerBond))+lowerBond;
        do{
            
            System.out.print("Guess the number : ");
            int num = sc.nextInt();

            if(num>comGuess){
                System.out.println("Try with smaller number");
            }
            else if(num<comGuess){
                System.out.println("Try with higher number");
            }
            else if(num == comGuess){
                System.out.println("You gussed it right !"+comGuess);
                break;
            }
            limit--;
            if(limit ==0){
                System.out.println("Game over. Real number is :"+comGuess);
                gamePlay = false;

            }

        }
        while(gamePlay );

        
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Number guessing game");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Guess Number betweel 1 to 100");

        guessNumber();
    }
}
