package com.annotations.repeatableannotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        try {
            Software software = new Software();
            Method method = software.getClass().getMethod("runApplication");

            // get all BugReport annotations
            BugReport[] reports = method.getAnnotationsByType(BugReport.class);

            for (BugReport report : reports) {
                System.out.println("Bug: " + report.description());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
