package org.example.multithreading;

public class Thread1WithRunnable implements  Runnable
{

    @Override
    public void run() {
        System.out.println("at Thread1");
        /*for (int i = 1; i <= 15; i++) {
            System.out.println("Thread1 is running: " + i);
            try {
                //Thread.sleep(1000); // Sleep for 1 second
                System.out.println(" totalIterationCount_1 : "+totalIterationCount_1());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        System.out.println(" totalIterationCount_1 : "+totalIterationCount_1());
        System.out.println("Thread1 has finished execution.");
    }

    public static int totalIterationCount_1()
    {
        int count = 0;

        for(int i =0; i < 100000; i++)
        {
            count++;
        }
        return count;
    }
}
