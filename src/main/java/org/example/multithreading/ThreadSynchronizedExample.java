package org.example.multithreading;

public class ThreadSynchronizedExample
{
    public static void main(String[] args)
    {

        System.out.println("line 1"); // sync
        System.out.println("line 2"); // sync
        System.out.println("line 3"); // sync
        /*Thread4 thread4_1 = new Thread4(); // 5 sec
        thread4_1.setName("Thread 1");
        System.out.println("thread4_1 : "+thread4_1.getState()); // NEW state
        thread4_1.start();
        /////
        try {
            //thread4_1.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Thread4 thread4_2 = new Thread4();
        thread4_2.setName("Thread 2");
        System.out.println("thread4_2 : "+thread4_2.getState());
        thread4_2.start();*/
        Thread5 thread5 = new Thread5(); // 5 sec
        System.out.println("thread5 : " + thread5); // 12321
        Thread thread_1 = new Thread(thread5);
        thread_1.setName("Thread 1");
        System.out.println("thread_1 : state " + thread_1.getState()); // NEW state

        Thread5 thread5_1 = new Thread5(); // 5 sec
        System.out.println("thread5_1 : " + thread5_1);
        Thread thread_2 = new Thread(thread5);
        thread_2.setName("Thread 2");



        thread_2.start();
        thread_1.start();

        System.out.println("thread_1 : state " + thread_1.getState()); // RUNNABLE state

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("thread_1 : state " + thread_1.getState());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("thread_1 : state " + thread_1.getState());

    }
}
