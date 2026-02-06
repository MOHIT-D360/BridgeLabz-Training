package com.functionalinterfaces.backgroundjobexecution;

public class BackgroundJobApp {

    public static void main(String[] args) {

        System.out.println("Main thread start");

        // Runnable using lambda
        Runnable job = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Background task running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        
        Thread t = new Thread(job);
        t.start();

        System.out.println("Main thread end");
    }
}
