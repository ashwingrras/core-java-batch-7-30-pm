package org.example.collection_framework;

import java.util.TreeSet;

/*
    roundoff .5 >
    11.20: 11
    11.80 : 12
 */
public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet maintains a sorted order and does not allow duplicates
        // binary search tree
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Lakshaya");
        treeSet.add("Ashwin");
        treeSet.add("Vatsala");
        treeSet.add("Ashwin"); // Duplicate element, will not be added
        treeSet.add("Bhavika");
        treeSet.add("Sandeep");
        treeSet.add("Rohan");
        treeSet.add("Bhavika"); // Duplicate element, will not be added
        treeSet.add("Ashwin"); // Duplicate element, will not be added

        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());

        for (String value : treeSet) {
            System.out.println("value = " + value);
        }

        System.out.println("Using lambda expression:");
        treeSet.forEach(value -> {
            System.out.println("value = " + value + ", value.hashCode() " + value.hashCode());
        });
    }
}
