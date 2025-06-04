package org.example.multithreading;

class MessagePrinter {
    // Synchronized method
    public synchronized void printMessage(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(500); // simulate delay
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(msg + "]");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
