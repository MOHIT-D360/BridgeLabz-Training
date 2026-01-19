package com.examproctor;

public class ExamProctorApp {
    public static void main(String[] args) {

        ExamSystem exam = new ExamSystem();

        exam.addQuestion(new Question(1,
                "how many eyes human have?",
                2));

        exam.addQuestion(new Question(2,
                "number of color in india national flag?",
                3));

        exam.addQuestion(new Question(3,
                "answer of 5*4 is :",
                20));

        // Student starts exam
        exam.showQuestion();

        exam.submitAnswer(2);   // correct
        exam.nextQuestion();

        exam.submitAnswer(4);   // wrong
        exam.nextQuestion();

        exam.submitAnswer(20);    // correct

        exam.previousQuestion();     // back to Queue

        exam.showScore();
    }
}

