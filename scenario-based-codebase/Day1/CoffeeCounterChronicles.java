package Day1;
import java.util.Scanner;

public class CoffeeCounterChronicles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 18% GST
        final double GST_RATE = 0.18; 

        while (true) {
            System.out.println("Enter coffee type (Espresso / Latte / Cappuccino)");
            System.out.println("Type 'exit' to stop");
            String coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you.");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // consume newline

            double price = 0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double total = price * quantity;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            System.out.println("Coffee Type: " + coffeeType);
            System.out.println("Price per cup: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: ₹" + total);
            System.out.println("GST (18%): " + gst);
            System.out.println("Final Bill: " + finalBill);
        }

        
    }
}
