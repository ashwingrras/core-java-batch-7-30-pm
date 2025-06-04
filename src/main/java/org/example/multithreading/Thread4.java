package org.example.multithreading;

/*
    1. NEW
    2. RUNNABLE
    3. TIMED_WAITING
    4. TERMINATED

    synchronized method

 */

public class Thread4 extends Thread
{
    @Override
    public synchronized  void  run() {
        System.out.println("at " + Thread.currentThread().getName() + " enter ");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished execution. exit");
    }


}
