package com.edumentor;

class FullTimeCertificate implements ICertifiable {

    @Override
    public void generateCertificate(Learner learner, double percentage) {
        if (percentage >= 75) {
            System.out.println(" Full-Time Course Certificate issued to " + learner.getName());
        } else {
            System.out.println(" Not eligible for Full-Time Certificate");
        }
    }
}
