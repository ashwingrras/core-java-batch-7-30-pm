package org.example.multithreading;

public class ThreadWaitingWithStringLock
{
    public static void main(String[] args)
    {
        String lock = "ashwin";

        Thread8 thread_1 = new Thread8(lock);
        thread_1.setName("Thread-1");
        Thread8 thread_2 = new Thread8(lock);
        thread_2.setName("Thread-2");

        thread_2.start();
        try {
            Thread.sleep(100); // Wait for 2 seconds to allow threads to enter synchronized block
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread_1.start();

        //System.out.println("Thread-1 state: " + thread_1.getState()); // RUNNABLE state
        //System.out.println("Thread-2 state: " + thread_2.getState()); // RUNNABLE state

        try {
            Thread.sleep(2000); // Wait for 2 seconds to allow threads to enter synchronized block
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread-1 state: " + thread_1.getState()); // RUNNABLE state
        System.out.println("Thread-2 state: " + thread_2.getState()); // RUNNABLE state

    }
}
