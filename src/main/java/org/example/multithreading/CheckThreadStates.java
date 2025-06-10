package org.example.multithreading;


/*
       1. NEW
       2. RUNNABLE
       3. TIMED_WAITING
       4. BLOCKED
       5. WAITING
       6. TERMINATED
 */
public class CheckThreadStates
{
    public static void main(String[] args)
    {
        Thread3 thread3_1 = new Thread3();
        thread3_1.setName("Thread 1");
        System.out.println("thread current state :"+thread3_1.getState()); // NEW
        //thread3_1.run(); // synchronous call
        thread3_1.start(); // asynchronous call
        System.out.println("thread current state :"+thread3_1.getState()); // RUNNABLE
        try {
            Thread.sleep(2000); // Sleep for 1 second to allow the thread to start
            System.out.println("after sleep 2000 ms, thread current state :"+thread3_1.getState());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("end of line, thread current state :"+thread3_1.getState()); // TIMED_WAITING
    }
}
