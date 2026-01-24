package com.LoanBuddy;

 public class LoanBuddyApp {

    public static void main(String[] args) {

        Applicant a1 = new Applicant("Mohit",720,50000,800000
        );

        Applicant a2 = new Applicant("Ravi",620,18000,400000
        );

        LoanApplication homeLoan = new HomeLoan(a1, 240);
        LoanApplication autoLoan = new AutoLoan(a2, 60);

        LoanEngine engine = new LoanEngine();

        System.out.println("---- Home Loan ----");
        engine.processLoan(homeLoan);

        System.out.println("\n---- Auto Loan ----");
        engine.processLoan(autoLoan);
    }
}
