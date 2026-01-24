package com.medistore;
import java.time.LocalDate;
public class MediStoreApp {
	public static void main(String[] args) {

        Medicine m1 = new Tablet(
                "Paracetamol",
                5.0,
                LocalDate.now().plusMonths(6)
        );

        Medicine m2 = new Syrup("Cough Syrup",80.0,LocalDate.now().plusDays(10),30);

        Medicine m3 = new Injection(
                "Insulin",
                250.0,
                LocalDate.now().plusMonths(2),
                20
        );

        m1.printDetails();
        m2.printDetails();
        m3.printDetails();

        System.out.println("\n--- Selling Medicines ---");

        m1.sell(10);
        m2.sell(5);
        m3.sell(2);
        
        System.out.println("\n--- after selling ---");
        
        m1.printDetails();
        m2.printDetails();
        m3.printDetails();
    }
}
