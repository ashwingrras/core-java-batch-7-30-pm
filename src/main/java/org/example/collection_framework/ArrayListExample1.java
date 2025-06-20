package org.example.collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1
{
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] numbers = new int[5];
        List<String> list = new ArrayList<>();
        list.add("lakshaya");
        list.add("ashwin");
        list.add("vatsala");
        list.add("bhavika");
        list.add("sandeeep");
        System.out.println("list = " + list);
        double d = 10;
        ArrayList<Double> numbersList = new ArrayList<>();
        numbersList.add(10.5);
        numbersList.add(20.5);
        numbersList.add(30.4);
        System.out.println("numbersList = " + numbersList);
        numbersList.add(50.5);
        System.out.println("numbersList = " + numbersList);
        numbersList.remove(10.5);
        System.out.println("numbersList = " + numbersList);
        numbersList.remove(40.6);
        System.out.println("numbersList = " + numbersList);
        System.out.println(numbersList.get(0));
        numbersList.add(1, 40.6);
        //numbersList.removeAll(numbersList);
        for(int i=0; i < numbersList.size(); i++)
        {
            System.out.println("numbersList.get(" + i + ") = " + numbersList.get(i));
        }
        System.out.println("Using for-each loop:");
        for(Double value : numbersList)
        {
            System.out.println("value = " + value);
        }
        System.out.println("Using lambda expression:");
        numbersList.forEach(value -> {
            System.out.println("value = " + value);
        });
    }
}
