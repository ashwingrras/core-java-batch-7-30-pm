package org.example.multithreading;

public class ThreadSynchronizedExample
{
    public static void main(String[] args)
    {

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
        Thread thread_1 = new Thread(thread5);
        thread_1.setName("Thread 1");

        //Thread5 thread5_1 = new Thread5(); // 5 sec
        Thread thread_2 = new Thread(thread5);
        thread_2.setName("Thread 2");

        thread_2.start();
        thread_1.start();

    }
}
