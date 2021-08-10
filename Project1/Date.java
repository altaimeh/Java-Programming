package com.company;

import java.util.Scanner;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int a, int b, int c) {
        setMonth(a);
        setDay(b);
        setYear(c);
        printDay();
    }

    public boolean isLeapYear(int x) {
        return (x % 100 == 0 && x % 400 == 0) || (x % 100 != 0 && x % 4 == 0);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int x) {
        if(year < 0) {
            this.year = 2000;
        }
        this.year = x;
        //System.out.println(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int x) {
        if(x < 1 || x > 12) {
            this.month = 1;
        }
        this.month = x;
        //System.out.println(month);
    }

    public void printMonth(int x) {
        switch(x) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }

    public void printDay(int x) {
            switch(x) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;
                case 10:
                    System.out.println("10");
                    break;
                case 11:
                    System.out.println("11");
                    break;
                case 12:
                    System.out.println("12");
                    break;
                case 13:
                    System.out.println("13");
                    break;
                case 14:
                    System.out.println("14");
                    break;
                case 15:
                    System.out.println("15");
                    break;
                case 16:
                    System.out.println("16");
                    break;
                case 17:
                    System.out.println("17");
                    break;
                case 18:
                    System.out.println("18");
                    break;
                case 19:
                    System.out.println("19");
                    break;
                case 20:
                    System.out.println("20");
                    break;
                case 21:
                    System.out.println("21");
                    break;
                case 22:
                    System.out.println("22");
                    break;
                case 23:
                    System.out.println("23");
                    break;
                case 24:
                    System.out.println("24");
                    break;
                case 25:
                    System.out.println("25");
                    break;
                case 26:
                    System.out.println("26");
                    break;
                case 27:
                    System.out.println("27");
                    break;
                case 28:
                    System.out.println("28");
                    break;
                case 29:
                    System.out.println("29");
                    break;
                case 30:
                    System.out.println("30");
                    break;
                case 31:
                    System.out.println("31");
                    break;
                default:
                    System.out.println("Invalid day! ");
            }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int temp_input_day) {
        this.day = temp_input_day;
        //System.out.println(day);
    }

    public void printDay() {
        System.out.println(month + "/ " + day + "/ " + year);
    }
}
