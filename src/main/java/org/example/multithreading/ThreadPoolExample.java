package org.example.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2); // Pool of 3 threads
        System.out.println("11111111");
        for (int i = 1; i <= 15; i++) {
            Runnable task = new Task(i);
            executor.submit(task); // Submit task to pool
        }
        System.out.println("2222222");
        //executor.shutdown(); // Gracefully shutdown after task completion
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("333333");
        for (int i = 16; i <= 20; i++) {
            Runnable task = new Task(i);
            executor.submit(task); // Submit task to pool
        }
        System.out.println("444444");
    }
}

class Task implements Runnable {
    private int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
    }
}

