package org.example.multithreading;


/*
    Thread life cycle:
    1. New: When a thread is created, it is in the new state.
    2. Runnable: When the thread is ready to run, it enters the runnable state.
    3. Blocked: When a thread is waiting for a monitor lock, it enters the blocked state.
    4. Waiting: When a thread is waiting for another thread to perform a particular action, it enters the waiting state.
    5. Timed Waiting: When a thread is waiting for another thread to perform an action for a specified period, it enters the timed waiting state.
    6. Terminated: When a thread has completed its execution, it enters the terminated state.


 */

public class MainClass
{
    public static void main(String[] args)
    {
        // Creating and starting threads using Runnable and Thread class
        Thread1WithRunnable thread1WithRunnable = new Thread1WithRunnable();
        Thread thread1 = new Thread(thread1WithRunnable);
        System.out.println(" 111111 ");
        //thread1.start();
//
        System.out.println(" 22222 ");
        // Creating and starting a thread using Thread class directly
        Thread2WithThreadClass thread2 = new Thread2WithThreadClass();
        thread1.start();
        thread2.start();

        System.out.println(" 333333 ");
    }
}
