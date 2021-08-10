package com.company;

public class Person {
    private String first_name;
    private String last_name;

    Person(String a, String b) {
        this.first_name = a;
        this.last_name = b;
    }

    public String toString() {
        return first_name + " " + last_name;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void set_first_name(String a) {
        this.first_name = a;
    }

    public void set_last_name(String b) {
        this.last_name = b;
    }
}
