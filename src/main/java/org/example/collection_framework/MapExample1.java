package org.example.collection_framework;

import java.util.*;

public class MapExample1
{
    public static void main(String[] args) {
        // < key, value >
        Map<String, String> map = new HashMap<>();
        map.put("101", "lakshaya");
        map.put("102", "ashwin");
        map.put("103", "vatsala");
        map.put("104", "bhavika");
        map.put("105", "sandeep");
        System.out.println("map.get(101) = " + map.get("101"));
        System.out.println("map.get(106) = " + map.get("106"));

        System.out.println("map = " + map);
        List<String> list = new ArrayList<>();
        Set<String> set = new LinkedHashSet<>();
        Queue<String> queue = new ArrayDeque<>();

        Map<String, Students> studentsMap = new HashMap<>();
        Students students_1 = new Students();
        students_1.setName("Lakshaya");
        students_1.setAge(20);
        students_1.setCourse("java full stack");

        studentsMap.put("101", students_1);

        Students students_2 = new Students();
        students_1.setName("sandeep");
        students_1.setAge(20);
        students_1.setCourse("java full stack");
        studentsMap.put("102", students_2);
        System.out.println("studentsMap = " + studentsMap);
        for(int i=0; i < studentsMap.size(); i++)
        {
            System.out.println("studentsMap.get(" + i + ") = " + studentsMap.get(i));
        }
        // first way of iterate / looping
        for (Map.Entry<String, Students> entry : studentsMap.entrySet()) {
            String key = entry.getKey();
            Students value = entry.getValue();
            //System.out.println("Key: " + key + ", Value: " + value);
            System.out.println("Key: " + key );
            System.out.println("Name: " + value.getName() + ", Age: "
                    + value.getAge() + ", Course: " + value.getCourse());
        }
        // second way of iterate / looping
        studentsMap.forEach((key, value) -> {
            System.out.println("Key: " + key);
            System.out.println("Name: " + value.getName() + ", Age: "
                    + value.getAge() + ", Course: " + value.getCourse());
        });
        TreeMap<String, String> hashMap = new TreeMap<>();
        hashMap.put("laskhaya", "101");
        hashMap.put("ashwin", "102");
        hashMap.put("vatsala", "103");
        hashMap.put("bhavika", "104");
        System.out.println("hashMap  asc = " + hashMap);
        NavigableMap<String, String >navigableMap = hashMap.descendingMap();
        System.out.println("hashMap desc = " + navigableMap);
        System.out.println(hashMap.lastKey());
    }
}
