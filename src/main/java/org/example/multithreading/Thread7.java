package org.example.multithreading;


/*
    sychronized method
    sychronized block

 */
public class Thread7 extends Thread
{
    private final Object lock;

    public Thread7(Object lock) {

        this.lock = lock;
    }

    @Override
    public void run() {

        System.out.println("Thread " + Thread.currentThread().getName() + " is trying to enter synchronized block.");
        synchronized (lock) {
            System.out.println("Thread " + Thread.currentThread().getName() + " has entered synchronized block.");
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " is running: " + i);
                    try {
                        //Thread.sleep(1000); // Sleep for 1 second
                        if(i == 3)
                        {
                            lock.wait();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            } catch (Exception e) {
                System.out.println("Thread " + Thread.currentThread().getName() + " was interrupted.");
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " is leaving synchronized block.");
            if(Thread.currentThread().getName().equalsIgnoreCase("Thread-1"))
            {
                //lock.notify();
            }
        }
    }
}
