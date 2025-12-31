import java.util.Scanner;

public class OnlineQuizGame{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int score =0;
        String[] questions = {"Which animal is called the King of the Jungle?",
		"How many days are there in a week?",
		"What is the color of the sun?",
		"Which fruit is red in color?",
		"How many eyes do we have?"
		};
		
		String[] options = { "1. Elephant 2. Tiger 3. Lion 4. Dog",
		"1. six , 2.  five , 3.  seven ,  4. eight",
		"1. blue 2. green 3. red 4. yellow",
		"1. Banana 2. Apple 3. mango 4. Orange",
		"1. one 2. two 3. three 4. four"
		};
        System.out.println("Welcome to quiz");
        System.out.println("__________________________");
        int[] answer = {3,3,4,2,2};
		
		for(int i=0;i<5;i++){

			
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.println("Enter your answer:");
            int userAnswer = sc.nextInt();

            switch (userAnswer) {
                case 1:
                    if (answer[i] == 1) {
                        score++;
                    }
                    break;
                case 2:
                    if (answer[i] == 2) {
                        score++;
                    }
                    break;
                case 3:
                    if (answer[i] == 3) {
                        score++;
                    }
                    break;
                case 4:
                    if (answer[i] == 4) {
                        score++;
                    }
                    break;
            
                default:
                    break;
            }


		}
        System.out.println("Your total score is: " + score + " out of 5");
        
    }
}