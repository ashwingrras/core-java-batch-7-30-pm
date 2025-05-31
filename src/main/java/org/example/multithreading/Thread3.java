package org.example.multithreading;

public class Thread3 extends Thread
{
    @Override
    public void run() {
        System.out.println("at "+Thread.currentThread().getName() +" enter ");
        // + " run method, thread state: " + Thread.currentThread().getState()
        // Simulating some work in the thread
        for (int i = 1; i <= 5; i++) {
            //System.out.println(Thread.currentThread().getName()+" is running: " + i +"thread state:" + Thread.currentThread().getState());
            System.out.println(Thread.currentThread().getName()+" is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 0.5 seconds
                //System.out.println("after sleep 1000 ms :"+Thread.currentThread().getState());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" has finished execution. exit");
    }
}
