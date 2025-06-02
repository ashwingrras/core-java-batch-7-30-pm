package org.example.multithreading;

public class ThreadTimedWaitingExample
{
    public static void main(String[] args)
    {
        Thread4 thread4_1 = new Thread4(); // 5 sec
        thread4_1.setName("Thread 1");
        System.out.println("thread4_1 : "+thread4_1.getState()); // NEW state
        thread4_1.start();
        System.out.println("thread4_1 : before sleep "+thread4_1.getState()); // RUNNABLE state
        try {
            Thread.sleep(1000); // wait for 1 seconds
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            //thread4_1.join(); // wait for thread4_1 to finish
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread4_1 : after sleep "+thread4_1.getState()); // TIMED_WAITING state or Terminated state
        /////
        /*Thread4 thread4_2 = new Thread4();
        thread4_2.setName("Thread 2");
        System.out.println("thread4_2 : "+thread4_2.getState());
        thread4_2.start();
        System.out.println("thread4_2 : before sleep "+thread4_2.getState());
        try {
            Thread.sleep(3000); // wait for 2 seconds
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread4_2 : after sleep "+thread4_2.getState());*/
    }
}
