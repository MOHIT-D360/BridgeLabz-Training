package com.javacollections.insurancepolicymanagementsystem;
import java.time.LocalDate;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {

        JavaSet system = new JavaSet();

        Policy p1 = new Policy("P101", "Alice",
                LocalDate.now().plusDays(10), "Health", 5000);

        Policy p2 = new Policy("P102", "Bob",
                LocalDate.now().plusDays(40), "Auto", 3000);

        Policy p3 = new Policy("P103", "Carol",
                LocalDate.now().plusDays(20), "Health", 7000);

        Policy p4 = new Policy("P101", "Alice Duplicate",
                LocalDate.now().plusDays(10), "Health", 5000);

        system.insert(p1);
        system.insert(p2);
        system.insert(p3);
        system.insert(p4); // duplicate

        System.out.println("\nAll Unique Policies:");
        system.showAllPolicies();

        System.out.println("\nPolicies Expiring Soon:");
        system.showExpiringSoonPolicies();

        System.out.println("\nHealth Policies:");
        system.showPoliciesByCoverage("Health");

        System.out.println("\nDuplicate Check:");
        system.findDuplicatePolicies(
            Arrays.asList(p1, p2, p3, p4)
        );
    }
}


