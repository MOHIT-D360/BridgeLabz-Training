package com.fitrack;

class ProgressTracker {

    private static final double DAILY_TARGET = 500;

    public void showProgress(double caloriesBurned) {
        double remaining = DAILY_TARGET - caloriesBurned;

        if (remaining > 0) {
            System.out.println("Calories remaining: " + remaining);
        } else {
            System.out.println("Daily target achieved!");
        }
    }
}

