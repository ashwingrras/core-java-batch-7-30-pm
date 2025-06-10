package org.example.multithreading;

public class Thread12 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread12 is running");
        try {
            for(int i =1; i <= 10; i++)
            {
                System.out.println("Thread12 is running iteration: " + i);
                Thread.sleep(1000);
            }
             // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread12 was interrupted");
        }
        System.out.println("Thread12 has finished running");
    }
}
