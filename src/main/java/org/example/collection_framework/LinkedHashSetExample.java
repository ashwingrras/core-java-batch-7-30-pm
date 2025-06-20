package org.example.collection_framework;

import java.util.Arrays;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // LinkedHashSet maintains insertion order and does not allow duplicates
        java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>();
        linkedHashSet.add("Lakshaya");
        linkedHashSet.add("Ashwin");
        linkedHashSet.add("Vatsala");
        linkedHashSet.add("Ashwin"); // Duplicate element, will not be added
        linkedHashSet.add("Bhavika");
        linkedHashSet.add("Sandeep");
        linkedHashSet.add("Rohan");
        linkedHashSet.add("Bhavika"); // Duplicate element, will not be added
        linkedHashSet.add("Ashwin"); // Duplicate element, will not be added


        System.out.println(linkedHashSet.toArray());
        String[] data = linkedHashSet.toArray(new String[0]);
        System.out.println("data "+ Arrays.toString(data));
        System.out.println("linkedHashSet = " + linkedHashSet);

        for (String value : linkedHashSet) {
            System.out.println("value = " + value);
        }

        System.out.println("Using lambda expression:");
        linkedHashSet.forEach(value -> {
            System.out.println("value = " + value + ", value.hashCode() " + value.hashCode());
        });
    }
}
