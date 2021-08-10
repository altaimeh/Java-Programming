package com.company;

//Al-Taimee Hassan
//gf6417

import java.util.Scanner;

abstract class Employer {

    String name;
    String department;
    double salary;
    double bonus;

    abstract void showSalary();
    abstract void showBonus();

}

class BasicEmployee extends Employer {

    BasicEmployee(String a,String b,double c) {
        this.name = a;
        this.department = b;
        this.salary = c;
    }

    void showSalary() {
        System.out.println("My name is " + this.name + ", in the " + this.department
                + " department, my salary is " + this.salary);
    }

    void showBonus() {
        System.out.println("I am BasicEmployee, no bonus, Work hard to upgrade!");
    }

}

class GoodEmployee extends Employer {

    GoodEmployee(String a,String b,double c,double d) {
        this.name = a;
        this.department = b;
        this.salary = c;
        this.bonus = d;
    }

    void showSalary() {
        System.out.println("My name is " + this.name + ", in the " + this.department
                + " department, my salary is " + this.salary);
    }

    void showBonus() {
        System.out.println("I am a GoodEmployee, and my bonus is " + this.bonus);
    }

}


public class Main {

    public static void main(String[] args) {
        boolean done = false;
        do {
            System.out.println("Welcome to JobHub! ");
            System.out.println("*******************");
            System.out.println("Please enter Employee 1 name : ");
            Employer temp_employee;
            Scanner input = new Scanner(System.in);
            String employee1 = input.nextLine();
            System.out.println("Hi there " + employee1);
            System.out.println("*******************");
            System.out.println("Please enter Employee 1 department : ");
            String department1 = input.nextLine();
            System.out.println("Congrats on the job ! ");
            System.out.println("*******************");
            System.out.println("Please enter Employee 1 salary : ");
            int salary1 = input.nextInt();
            System.out.println("*******************");
            temp_employee = new BasicEmployee(employee1, department1, salary1);
            System.out.println("Employee 1 data : ");
            temp_employee.showSalary();
            temp_employee.showBonus();
            if(salary1 < 50000) {
                System.out.println("Maybe think about getting a better job... ");
            }
            if (salary1 >= 50000) {
                System.out.println("You are balling ! ");
            }
            System.out.println();
            System.out.println("1. Press 1 to try with your own inputs again");
            System.out.println("2. Press 2 to continue");
            System.out.println("3. Press 3 or any other character to quit program");
            int choice = input.nextInt();
            if(choice == 1) {
                continue;
            }
            if(choice == 2) {
                System.out.println("*******************");
                System.out.println("Please enter Employee 2 name : ");
                Scanner input2 = new Scanner(System.in);
                String employee2 = input2.nextLine();
                System.out.println("Hi there " + employee2);
                System.out.println("*******************");
                System.out.println("Please enter Employee 2 department : ");
                String department2 = input2.nextLine();
                System.out.println("Congrats on the job ! ");
                System.out.println("*******************");
                System.out.println("Please enter Employee 2 salary : ");
                double salary2 = input2.nextDouble();
                System.out.println("*******************");
                System.out.println("Please enter Employee 2 bonus : ");
                double bonus2 = input2.nextDouble();
                temp_employee = new GoodEmployee(employee2, department2, salary2, bonus2);
                System.out.println("*******************");
                System.out.println("Employee 2 data : ");
                temp_employee.showSalary();
                temp_employee.showBonus();
                if (salary2 < 50000) {
                    System.out.println("Maybe think about getting a better job... ");
                }
                if (salary2 >= 50000) {
                    System.out.println("You are balling ! ");
                }
                System.out.println();
                System.out.println("1. Press 1 to go back to home page");
                System.out.println("2. Press 2 or any other character to quit program");
                int choiceB = input2.nextInt();
                if (choiceB == 1) {
                    continue;
                }
                done = true;
            }
            done = true;
        } while (!done);
    }

}
