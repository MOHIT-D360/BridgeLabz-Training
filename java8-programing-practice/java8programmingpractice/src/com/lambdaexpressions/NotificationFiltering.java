package com.lambdaexpressions;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {

    // Alert class
    static class Alert {
        String message;
        String type; 

        Alert(String message, String type) {
            this.message = message;
            this.type = type;
        }

        @Override
        public String toString() {
            return type + " : " + message;
        }
    }

    public static void main(String[] args) {

        //  List of alerts
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("Heart rate critical", "EMERGENCY"));
        alerts.add(new Alert("Take BP medicine", "MEDICINE"));
        alerts.add(new Alert("Doctor appointment tomorrow", "GENERAL"));
        alerts.add(new Alert("Blood pressure very high", "EMERGENCY"));

        //  Predicate using lambda (filter rule)
        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");

        //  Apply filter
        System.out.println("Showing EMERGENCY alerts only:\n");

        for (Alert alert : alerts) {
            if (emergencyOnly.test(alert)) {
                System.out.println(alert);
            }
        }
    }
}
