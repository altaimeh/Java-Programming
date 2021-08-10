package com.company;

public class Teacher extends Person{
    String title;
    String department;

    public Teacher() {
        this.title = "Teacher";
        this.department = "Computer Science";
        this.name = "John Wick";
        this.gender = "Male";
        this.age = 35;
    }

    public Teacher (String a, String b, String c,
                    String d, int e) {
        this.title = a;
        this.department = b;
        this.name = c;
        this.gender = d;
        this.age = e;
    }

    public int getAge() {
        System.out.print("Age: ");
        return age;
    }

    public String getName() {
        return "Name : " + name;
    }

    public String getGender() {
        return "Gender : " + gender;
    }

    public String getTitle() {
        return "Title : " + title;
    }

    public String getDepartment() {
        return "Department : " + department;
    }
}
