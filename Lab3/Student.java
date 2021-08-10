package com.company;

public class Student extends Person{
    int studentID;
    String admissionYear;
    String major;

    public Student() {
        this.studentID = 123456789;
        this.admissionYear = "Fall 2019";
        this.major = "Computer Science";
        this.name = "Al";
        this.gender = "Male";
        this.age = 20;
    }

    public Student (int a, String b, String c, String d,
                    String e, int f) {
        this.studentID = a;
        this.admissionYear = b;
        this.major = c;
        this.name = d;
        this.gender = e;
        this.age = f;

    }

    public int getStudentID() {
        System.out.print("Student ID : ");
        return studentID;
    }

    public String getAdmissionYear() {
        return "Entry : " + admissionYear;
    }

    public String getMajor() {
        return "Major : " + major;
    }

    public int getAge() {
        System.out.print("Age : ");
        return age;
    }

    public String getName() {
        return "Name : " + name;
    }

    public String getGender() {
        return "Gender : " + gender;
    }
}
