package com.examproctor;

import java.util.*;

class ExamSystem {

    HashMap<Integer, Question> questionMap = new HashMap<>();
    Stack<Question> questionStack = new Stack<>();

    int currentId = 1;
    int score = 0;

    // Add question
    void addQuestion(Question q) {
        questionMap.put(q.id, q);
    }

    // Show current question
    void showQuestion() {
        Question q = questionMap.get(currentId);
        questionStack.push(q);

        System.out.println("\nQuestion " + q.id);
        System.out.println(q.question);
    }

    // Submit answer
    void submitAnswer(double userAnswer) {
        Question q = questionStack.peek();

        if (q.answer == (userAnswer)) {
            score++;
            System.out.println(" Correct Answer");
        } else {
            System.out.println("Wrong Answer");
        }
    }

    // Next question
    void nextQuestion() {
        if (currentId < questionMap.size()) {
            currentId++;
            showQuestion();
        } else {
            System.out.println("No more questions");
        }
    }

    // Previous question
    void previousQuestion() {
        if (questionStack.size() > 1) {
            questionStack.pop(); // remove current
            Question prev = questionStack.peek();

            currentId = prev.id;

            System.out.println("\nPrevious Question:");
            System.out.println(prev.question);
        } else {
            System.out.println("No previous question");
        }
    }

    void showScore() {
        System.out.println("\nFinal Score: " + score);
    }
}
