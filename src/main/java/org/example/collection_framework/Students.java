package org.example.collection_framework;

public class Students
{
    String name;
    int age;
    String course;

    public Students(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public Students() {
    }
    // setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
