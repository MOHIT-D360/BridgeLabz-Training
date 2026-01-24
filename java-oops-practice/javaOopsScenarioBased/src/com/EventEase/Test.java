package com.EventEase;

public class Test {
    public static void main(String[] args) {

        User u1 = new User("Mohit","mohit@gmail.com");

        Event e1 = Event.createEvent(
                new BirthdayEvent(
                        "Birthday",
                        "Indore",
                        "10-Oct-2026",
                        120,
                        true,
                        true,
                        u1
                )
        );

        if (e1 != null) {
            e1.schedule();
            e1.schedule();   
            e1.cancel();
            e1.schedule();  
            e1.reschedule("12-Oct-2026");
            e1.schedule();  
        }

        System.out.println("------");

      
        Event e2 = Event.createEvent(
                new BirthdayEvent(
                        "Another Event",
                        "Bhopal",
                        "20-Oct-2026",
                        50,
                        false,
                        false,
                        u1
                )
        );
    }
}
