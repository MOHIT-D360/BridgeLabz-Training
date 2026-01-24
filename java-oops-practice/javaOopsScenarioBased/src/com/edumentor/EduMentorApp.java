package com.edumentor;

public class EduMentorApp {
    public static void main(String[] args) {

        Learner learner = new Learner(
                "Mohit", "mohit@gmail.com", "L101"
        );

        Quiz quiz = new Quiz("easy");

        int[] answers = {4, 1};
        quiz.submitAnswers(answers);

        double percentage = quiz.calculatePercentage();
        System.out.println("Score: " + percentage + "%");

        ICertifiable cert;

        // Short course
        cert = new ShortCourseCertificate();
        cert.generateCertificate(learner, percentage);

        // Full-time course
        cert = new FullTimeCertificate();
        cert.generateCertificate(learner, percentage);
    }
}
