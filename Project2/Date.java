package com.company;

public class Date {
    private int month;
    private int day;
    private int year;

    Date(int a, int b, int c) {
        this.month = a;
        this.day = b;
        this.year = c;
    }

    public String toString() {
        return this.month + " / " + this.day + " / " + this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int a) {
        this.month = a;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int a) {
        this.day = a;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int a) {
        this.year = a;
    }

}
