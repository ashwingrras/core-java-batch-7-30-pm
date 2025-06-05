package org.example.multithreading;

public class ThreadWaitingExample
{

    public static void main(String[] args)
    {
        Object lock = new Object();

        Thread7 thread_1 = new Thread7(lock);
        thread_1.setName("Thread-1");
        Thread7 thread_2 = new Thread7(lock);
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

        try {
            Thread.sleep(5000); // Wait for 2 seconds to allow threads to enter synchronized block
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //lock.notify();
        synchronized (lock) {
            System.out.println("Thread-1 is notifying Thread-2 to continue.");
            //lock.notify();
            lock.notifyAll();
            System.out.println("Thread-1 has notified Thread-2 to continue.");
        }
        System.out.println("Thread-1 state: " + thread_1.getState()); // RUNNABLE state
        System.out.println("Thread-2 state: " + thread_2.getState()); // RUNNABLE state
        // Notify thread_2 to continue

    }
}
