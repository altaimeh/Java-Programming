package com.company;

public class Person {
    String name;
    String gender;
    int age;

    public Person () {
        this.name = "Taimee";
        this.gender = "Male";
        this.age = 20;
    }

    public Person (String a, String b, int c) {
        this.name = a;
        this.gender = b;
        this.age = c;
    }

    public String getName() {
        return "Name : " + name;
    }

    public String getGender() {
        return "Gender : " + gender;
    }

    public int getAge() {
        System.out.print("Age: ");
        return age;
    }
}
