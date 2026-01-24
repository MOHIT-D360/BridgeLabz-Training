package com.edumentor;
class Quiz {

    private String[] questions;      // ❌ cannot access directly
    private int[] correctAnswers;    // ❌ protected answers
    private int score;

    // Constructor with difficulty
    Quiz(String difficulty) {
        if (difficulty.equalsIgnoreCase("easy")) {
            questions = new String[]{
                "2 + 2 = ?", "Capital of India?"
            };
            correctAnswers = new int[]{4, 1}; // assume 1 = Delhi
        } else {
            questions = new String[]{
                "OOP pillar count?", "Binary of 5?"
            };
            correctAnswers = new int[]{4, 101};
        }
    }

    
    public void submitAnswers(int[] userAnswers) {
        score = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i] == correctAnswers[i]) {
                score++;
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / questions.length;
    }
}
