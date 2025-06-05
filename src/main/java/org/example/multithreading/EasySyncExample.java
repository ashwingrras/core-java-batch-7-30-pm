package org.example.multithreading;


/*
    Thread states:
    1. NEW: The thread is created but not yet started.
    2. RUNNABLE: The thread is ready to run and waiting for CPU time.
    3. BLOCKED: The thread is blocked waiting for a monitor lock.
    4. WAITING: The thread is waiting indefinitely for another thread to perform a particular action.
    5. TIMED_WAITING: The thread is waiting for another thread to perform an action for up to a specified waiting time.
    6. TERMINATED: The thread has completed its execution.
 */

public class EasySyncExample {
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();
        MessagePrinter printer_1 = new MessagePrinter();

        MyThread6 t1 = new MyThread6(printer, "Hello");
        MyThread6 t2 = new MyThread6(printer, "World");

        t1.start();
        t2.start();

        System.out.println("t2 "+t2.getState()); // RUNNABLE state
        try {
            Thread.sleep(10500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("t2 "+t2.getState());
    }
}

