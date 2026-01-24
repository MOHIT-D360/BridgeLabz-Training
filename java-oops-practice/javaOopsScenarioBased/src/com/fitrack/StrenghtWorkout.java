package com.fitrack;

class StrengthWorkout extends Workout {

    StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    void calculateCalories(UserProfile user) {
        caloriesBurned = duration * 5;
    }
}
