package com.fitrack;

public class FitTrackApp {
    public static void main(String[] args) {

        UserProfile user = new UserProfile(
                "Mohit", 21, 70.5, "Lose Weight"
        );

        Workout w1 = new CardioWorkout(30);
        Workout w2 = new StrengthWorkout(40);

        ProgressTracker tracker = new ProgressTracker();


        w1.startWorkout();
        w1.calculateCalories(user);
        w1.stopWorkout();

        System.out.println("Calories Burned: " + w1.getCaloriesBurned());
        tracker.showProgress(w1.getCaloriesBurned());

        System.out.println("----------------");


        w2.startWorkout();
        w2.calculateCalories(user);
        w2.stopWorkout();

        System.out.println("Calories Burned: " + w2.getCaloriesBurned());
        tracker.showProgress(w2.getCaloriesBurned());
    }
}

