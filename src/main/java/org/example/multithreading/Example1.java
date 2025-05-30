package org.example.multithreading;

public class Example1
{
    public static void main(String[] args)
    {
        System.out.println(" 11111 ");
        System.out.println(totalIterationCount_1()); // line 1
        System.out.println(" 22222 ");
        System.out.println(totalIterationCount_2()); // line 2
        System.out.println(" 33333 ");
        // thread 1 : 10 mb
        // thread 2 : 10 mb
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

    public static int totalIterationCount_2()
    {
        int count = 0;

        for(int i =0; i < 100; i++)
        {
            count++;
        }
        return count;
    }

}
