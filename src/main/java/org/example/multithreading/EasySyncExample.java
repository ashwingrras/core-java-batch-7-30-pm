package org.example.multithreading;

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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("t2 "+t2.getState());
    }
}

