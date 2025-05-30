package org.example.multithreading;


/*
        1 min:  60 sec
        1 hour: 3600 sec, 60 minute
        1 sec: 1000 ms


 */
public class Thread2WithThreadClass extends Thread
{
    @Override
    public void run() {
        System.out.println("at Thread2");
        /*for (int i = 1; i <= 1500; i++) {
            //System.out.println("Thread2 is running: " + i);
            try {
                //Thread.sleep(1000); // Sleep for 1 second

            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        System.out.println(" totalIterationCount_2 : "+totalIterationCount_2());
        System.out.println("Thread2 has finished execution.");
    }

    public static int totalIterationCount_2()
    {
        int count = 0;

        for(int i =0; i < 100000; i++)
        {
            count++;
        }
        return count;
    }
}
