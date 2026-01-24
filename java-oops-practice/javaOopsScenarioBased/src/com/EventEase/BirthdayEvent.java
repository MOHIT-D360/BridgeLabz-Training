package com.EventEase;

public class BirthdayEvent extends Event {

    BirthdayEvent(String name, String location, String date,
                  int attendees, boolean catering,
                  boolean decoration, User organizer) {

        super(name, location, date, attendees, catering, decoration, organizer);
    }

    @Override
    public void schedule() {

        if (state == EventState.ACTIVE) {
            System.out.println(" Event already active");
            return;
        }

        if (state == EventState.CANCELLED) {
            System.out.println(" Cancelled event cannot be scheduled. Create/reschedule first.");
            return;
        }

        calculateCost(8000);
        state = EventState.ACTIVE;

        System.out.println(" Birthday Event Scheduled | Cost: ₹" + getTotalCost());
    }

    @Override
    public void reschedule(String newDate) {

        if (state != EventState.CANCELLED) {
            System.out.println(" Only cancelled events can be rescheduled");
            return;
        }

        this.date = newDate;
        state = EventState.NOT_SCHEDULED;
        System.out.println(" Event rescheduled, ready to schedule again");
    }

    @Override
    public void cancel() {

        if (state != EventState.ACTIVE) {
            System.out.println(" Only active events can be cancelled");
            return;
        }

        state = EventState.CANCELLED;
        freeSlot(); 

        System.out.println(" Event cancelled successfully");
    }
}