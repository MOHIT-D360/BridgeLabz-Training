import java.util.Scanner;

public class TrainReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome of Train Reservation portal");
        System.out.println("________________________________________");
        boolean bookingOpen = true;
        int seats = 10;
        while(bookingOpen){
            System.out.println("press 1     : Book");
            System.out.println("press 2     : cancle");
            System.out.println("press 0     : exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if(seats>=0){
                        System.out.println("Ticket Booked");
                        System.out.println("Number of seat left :"+seats);

                        seats = seats -1;

                    }
                    break;
                case 2:
                    if(seats<=10){
                        System.out.println("Ticket cancled");
                        System.out.println("Number of seat left :"+seats);

                        seats++;

                    }
                    break;
                case 0:
                    System.out.println("__________Exit_________");
                    bookingOpen= false;
                    break;
                default:
                    System.out.println("Invalid number");
                    break;
            }

            if(seats==0){
                bookingOpen= false;
            }
            else if (seats<0){
                bookingOpen = false;
            }

        }
    }
}
