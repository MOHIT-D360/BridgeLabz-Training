import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int distancePerStop = 5; 

        while (true) {

            totalDistance += distancePerStop;
            System.out.println("Bus reached next stop.");
            System.out.println("Distance covered so far: " + totalDistance + " km");

            System.out.print("Do you want to get off here? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Passenger got off.");
                break; 
            }
        }

        System.out.println("Total distance travelled: " + totalDistance + " km");
    }
}
