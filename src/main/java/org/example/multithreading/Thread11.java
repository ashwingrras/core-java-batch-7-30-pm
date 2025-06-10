package org.example.multithreading;

public class Thread11  extends Thread{

    @Override
    public void run() {
        System.out.println("Thread11 is running");
        try {
            for(int i =1; i <= 5; i++)
            {
                System.out.println("Thread11 is running iteration: " + i);
                Thread.sleep(1000);
            }
             // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread11 was interrupted");
        }
        System.out.println("Thread11 has finished running");
    }
}
