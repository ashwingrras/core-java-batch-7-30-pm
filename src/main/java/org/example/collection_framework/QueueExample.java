package org.example.collection_framework;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue is an interface, we can use LinkedList or PriorityQueue to implement it
        // LinkedList implements Queue interface
        // PriorityQueue implements Queue interface and maintains a priority order

        // Example using LinkedList as a Queue
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Lakshaya");
        queue.add("Ashwin");
        queue.add("Vatsala");
        queue.add("Bhavika");
        queue.add("Sandeep");
        queue.add("Rohan");

        queue.element();

        System.out.println("Queue: " + queue);

        // Peek the head of the queue
        System.out.println("Peek: " + queue.peek());

        // Poll removes and returns the head of the queue
        System.out.println("Poll: " + queue.poll());

        System.out.println("Queue after poll: " + queue);

        // Iterate through the queue
        for (String value : queue) {
            System.out.println("value = " + value);
        }
    }
}
