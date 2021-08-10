package com.company;

public class Student {
    private int studentId;
    private String name;
    private int age;

    Student(int a, String b, int c) {
        this.studentId = a;
        this.name = b;
        this.age = c;
    }

    public String toString() {
        return ("Student ID: " + studentId + ",  Name: " + name + ",  Age: " + age + " years");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int x) {
        studentId = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String x) {
        name = x;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int x) {
        age = x;
    }

    public void increaseAge(Student[] a) {
        for(int i = 0; i < a.length; i++) {
            a[i].setAge(a[i].getAge() + 1);
        }
        for(int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
            System.out.println();
        }
    }

    public void greater_than_20(Student[] a) {
        int temp_counter = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].getAge() > 20) {
                System.out.println(a[i]);
                temp_counter++;
            }
            else {
                System.out.println("You have not entered any students older than 20 years old. ");
            }
        }
    }
}
