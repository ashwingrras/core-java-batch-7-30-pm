package org.example.multithreading;

public class ThreadDeamonExample {

    public static void main(String[] args) {
        Thread11 thread11 = new Thread11(); // normal thread
        thread11.setName("Thread 11");
        thread11.start();

        Thread13 thread13 = new Thread13(); // normal thread
        thread13.setName("Thread 13");
        thread13.start();

        Thread12 thread12 = new Thread12(); // daemon thread
        thread12.setDaemon(true); // Set thread12 as a daemon thread
        thread12.setName("Thread 12");
        thread12.start();
    }
}
