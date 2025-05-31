package org.example.multithreading;

public class NormalClass
{
    public void run() {
        System.out.println("at NormalClass");
        for (int i = 1; i <= 10; i++) {
            System.out.println("NormalClass is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("NormalClass has finished execution.");
    }
}
