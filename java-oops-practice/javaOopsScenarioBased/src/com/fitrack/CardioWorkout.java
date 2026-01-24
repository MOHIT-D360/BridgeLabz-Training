package com.fitrack;

class CardioWorkout extends Workout {

    CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    void calculateCalories(UserProfile user) {
        
        caloriesBurned = duration * 8;
    }
}
