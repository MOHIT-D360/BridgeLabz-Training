package com.fitrack;

abstract class Workout implements ITrackable {
    protected String type;
    protected int duration; // in minutes
    protected double caloriesBurned;

    // internal logs (hidden)
    private boolean active;

    Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.active = false;
    }

    @Override
    public void startWorkout() {
        active = true;
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        active = false;
        System.out.println(type + " workout stopped");
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    
    abstract void calculateCalories(UserProfile user);
}
