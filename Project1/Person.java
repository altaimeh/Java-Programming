package com.company;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String name;
    private String gender;
    private int age;
    private ArrayList<Person> children;

    Person(int a, String b, String c) {
        age = a;
        name = b;
        gender = c;
        children = new ArrayList<Person>();

    }

    int increaseAge() {
        return age++;
    }

    public String getName() {
        return name;
    }

    public void setName(String x) {
        name = x;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String x) {
        gender = x;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int x) {
        age = x;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(Person x) {
        children.add(x);
    }
}
