package com.EventEase;

abstract class Event implements ISchedulable {

    private final int eventId;              // immutable
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    protected boolean catering;
    protected boolean decoration;

    protected User organizer;

    private double totalCost;               // hidden
    protected EventState state;             // 🔥 REAL STATE

    private static int idCounter = 100;
    private static boolean eventInUse = false; // 🔥 LIMIT CREATION

    // 🔒 PRIVATE constructor logic controller
    protected Event(String eventName, String location, String date,
                    int attendees, boolean catering,
                    boolean decoration, User organizer) {

        this.eventId = idCounter++;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.catering = catering;
        this.decoration = decoration;
        this.organizer = organizer;

        this.state = EventState.NOT_SCHEDULED;
    }

    // 🔥 FACTORY METHOD (LIMITED CREATION)
    public static Event createEvent(Event event) {
        if (eventInUse) {
            System.out.println("❌ Another event is already active. Cancel it first.");
            return null;
        }
        eventInUse = true;
        return event;
    }

    protected void calculateCost(double venueCost) {
        double serviceCost = 0;
        if (catering) serviceCost += 5000;
        if (decoration) serviceCost += 3000;

        double discount = (attendees > 100) ? 2000 : 0;
        totalCost = venueCost + serviceCost - discount;
    }

    protected double getTotalCost() {
        return totalCost;
    }

    public EventState getState() {
        return state;
    }

    protected void freeSlot() {
        eventInUse = false;
    }
}
