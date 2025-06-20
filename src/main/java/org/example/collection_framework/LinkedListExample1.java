package org.example.collection_framework;

import java.util.LinkedList;

public class LinkedListExample1
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Lakshaya");
        linkedList.add("Ashwin");
        linkedList.add("Vatsala");
        linkedList.add("Bhavika");
        linkedList.add("Sandeep");
        System.out.println("linkedList = " + linkedList);
        linkedList.addFirst("First Element");
        linkedList.addLast("Last Element");
        System.out.println("After adding first and last: linkedList = " + linkedList);
        System.out.println(linkedList.remove());
        System.out.println("After removing first element: linkedList = " + linkedList);
        linkedList.removeLast();
        System.out.println("After removing last element: linkedList = " + linkedList);
        linkedList.add("New Element");
        linkedList.add("1111");
        linkedList.add("New Element");
        linkedList.add("2222");
        System.out.println("After removing last element: linkedList = " + linkedList);
        //linkedList.removeLastOccurrence("New Element");
        //linkedList.remove("New Element");
        linkedList.removeFirstOccurrence("New Element");
        System.out.println("After removing last occurrence of 'New Element': linkedList = " + linkedList);
        System.out.println(linkedList.getFirst());

        for(int i=0; i < linkedList.size(); i++)
        {
            System.out.println("numbersList.get(" + i + ") = " + linkedList.get(i));
        }
        System.out.println("Using for-each loop:");
        for(String value : linkedList)
        {
            System.out.println("value = " + value);
        }
        System.out.println("Using lambda expression:");
        linkedList.forEach(value -> {
            System.out.println("value = " + value);
        });
        /*linkedList.peek();
        linkedList.poll();
        linkedList.pop();*/
    }
}
