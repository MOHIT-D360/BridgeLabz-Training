package com.annotations.repeatableannotation;
import java.lang.annotation.*;

public class Software {

    @BugReport(description = "NullPointerException occurs")
    @BugReport(description = "UI alignment issue on dashboard")
    public void runApplication() {
        System.out.println("Application is running...");
    }
}