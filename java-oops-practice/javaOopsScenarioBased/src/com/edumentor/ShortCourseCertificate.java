package com.edumentor;
class ShortCourseCertificate implements ICertifiable {

    @Override
    public void generateCertificate(Learner learner, double percentage) {
        if (percentage >= 60) {
            System.out.println("Short Course Certificate issued to " + learner.getName());
        } else {
            System.out.println("❌ Not eligible for Short Course Certificate");
        }
    }
}