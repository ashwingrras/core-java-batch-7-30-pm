package org.example.multithreading;

public class Thread5 implements Runnable{
    @Override
    public synchronized void run() {
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
