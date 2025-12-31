import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LibraryRemainder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Enter issue Date of Book (yyyy-MM-dd): " + i);
                LocalDate issueDate = LocalDate.parse(sc.next(), formatter);

                System.out.println("Enter return Date of this Book (yyyy-MM-dd): " + i);
                LocalDate returnDate = LocalDate.parse(sc.next(), formatter);

                if (returnDate.isAfter(issueDate)) {
                    long days = ChronoUnit.DAYS.between(issueDate, returnDate);
                    System.out.println("You have to give fine of Rs: " + (days * 5)+ "Days: " + days);
                } else {
                    System.out.println("Invalid date: Return date must be after issue date");
                }

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format! Please enter date in yyyy-MM-dd format.");
                i--; 
            }
        }

       
    }
}
