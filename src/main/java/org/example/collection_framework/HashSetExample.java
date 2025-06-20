package org.example.collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample
{
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Lakshaya");
        hashSet.add("Ashwin");
        hashSet.add("Vatsala");
        hashSet.add("Ashwin");
        hashSet.add("Bhavika");
        hashSet.add("Sandeep");
        hashSet.add("Rohan");
        hashSet.add("Bhavika"); // Duplicate element, will not be added
        hashSet.add("Ashwin");
        System.out.println("hashSet = " + hashSet);
        /*for(int i=0; i < hashSet.size(); i++)
        {
            System.out.println("numbersList.get(" + i + ") = ");
        }*/
        for(String value : hashSet)
        {
            System.out.println("value = " + value);
        }
        System.out.println("Using lambda expression:");
        hashSet.forEach(value -> {
            System.out.println("value = " + value+", value.hashCode() "+value.hashCode());
        });
    }
}
