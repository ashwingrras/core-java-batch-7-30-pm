package org.example.multithreading;


/*  Thread states in Java:
    1. NEW
    2. RUNNABLE
    3. TIMED WAITING
    4. WAITING
    5. BLOCKED
    6. TERMINATED


 */

public class TestCallMultipleThreads
{
    public static void main(String[] args)
    {
        Thread3 thread3_1 = new Thread3();
        thread3_1.setName("Thread 1");
        System.out.println("thread current state :"+thread3_1.getState()); // NEW
        //thread3_1.run(); // synchronous call
        thread3_1.start(); // asynchronous call
        System.out.println("thread current state :"+thread3_1.getState()); // RUNNABLE
        /*NormalClass normalClass = new NormalClass();
        normalClass.run();

        Thread3 thread3_2 = new Thread3();
        thread3_2.start();*/
        try {
            //Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //thread3_1.stop();
        System.out.println("thread current state :"+thread3_1.getState());

        System.out.println("******************");
        Thread3 thread3_2 = new Thread3();
        thread3_2.setName("Thread 2");
        thread3_2.start();

        Thread3 thread3_3 = new Thread3();
        thread3_3.setName("Thread 3");
        thread3_3.start();
/*
        Thread3 thread3_4 = new Thread3();
        thread3_4.setName("Thread 4");
        thread3_4.start();*/

        //System.out.println("at main method end, thread current state :"+thread3_1.getState());
    }
}
