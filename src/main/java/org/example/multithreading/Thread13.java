package org.example.multithreading;

public class Thread13 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread13 is running");
        try {
            for (int i = 1; i <= 7; i++) {
                System.out.println("Thread13 is running iteration: " + i);
                Thread.sleep(1000);
            }
            // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread13 was interrupted");
        }
        System.out.println("Thread13 has finished running");
    }
}
