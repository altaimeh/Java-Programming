package com.company;
import java.util.Scanner;

//Al-Taimee Hassan
//gf6417

public class Main {

    public static void main(String[] args) {

        Student no1 = new Student();
        Teacher t1 = new Teacher();
        boolean done = false;
        do {
            System.out.println("***********************");
            System.out.println("Student data ");
            System.out.println("_____________");
            System.out.println(no1.getName());
            System.out.println(no1.getGender());
            System.out.println(no1.getAge());
            System.out.println(no1.getAdmissionYear());
            System.out.println(no1.getMajor());
            System.out.println(no1.getStudentID());
            System.out.println("***********************");

            System.out.println("Teacher data ");
            System.out.println("_____________");
            System.out.println(t1.getName());
            System.out.println(t1.getAge());
            System.out.println(t1.getGender());
            System.out.println(t1.getTitle());
            System.out.println(t1.getDepartment());
            System.out.println("***********************");

            System.out.println("Would you like to run it back?");
            System.out.println("Press 1 to run it back");
            System.out.println("Press 2 to try with your own inputs");
            System.out.println("Press 3 or any other character to quit");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                continue;
            }
            if (choice == 2) {
                System.out.println("Please enter Student First Name : ");
                Scanner insertName = new Scanner(System.in);
                String tempName = insertName.next();
                System.out.println("Please enter Student Gender : ");
                String tempGender = insertName.next();
                System.out.println("Please enter Student age : ");
                int tempAge = insertName.nextInt();
                System.out.println("Please enter Student Admission semester (No Spaces Please) : ");
                String tempAdmissionYear = insertName.next();
                System.out.println("Please enter Student Major (No Spaces Please) : ");
                String tempMajor = insertName.next();
                System.out.println("Please enter Student ID : ");
                int tempID = insertName.nextInt();
                Student userInput = new Student(tempID, tempAdmissionYear,
                        tempMajor, tempName, tempGender, tempAge);
                System.out.println("***********************");
                System.out.println("Student data ");
                System.out.println("_____________");
                System.out.println(userInput.getName());
                System.out.println(userInput.getGender());
                System.out.println(userInput.getAge());
                System.out.println(userInput.getAdmissionYear());
                System.out.println(userInput.getMajor());
                System.out.println(userInput.getStudentID());
                System.out.println("***********************");

                System.out.println("Please enter Teacher First Name : ");
                Scanner insertNameB = new Scanner(System.in);
                String tempNameB = insertNameB.next();
                System.out.println("Please enter Teacher Gender : ");
                String tempGenderB = insertNameB.next();
                System.out.println("Please enter Teacher age : ");
                int tempAgeB = insertNameB.nextInt();
                System.out.println("Please enter Teacher Title : ");
                String tempTitle = insertNameB.next();
                System.out.println("Please enter Teacher Department (No spaces please) : ");
                String tempDepartment = insertNameB.next();

                Teacher teacherInput = new Teacher(tempTitle, tempDepartment, tempNameB,
                        tempGenderB, tempAgeB);

                System.out.println("***********************");
                System.out.println("Teacher data ");
                System.out.println("_____________");
                System.out.println(teacherInput.getName());
                System.out.println(teacherInput.getAge());
                System.out.println(teacherInput.getGender());
                System.out.println(teacherInput.getTitle());
                System.out.println(teacherInput.getDepartment());
                System.out.println("***********************");

                System.out.println("Would you like to run it back?");
                System.out.println("Press 1 to run it back");
                System.out.println("Press 2 or any other character to quit");
                Scanner inputSecond = new Scanner(System.in);
                int choiceB = inputSecond.nextInt();
                if(choiceB == 1) {
                    continue;
                }
                done = true;
            }
            done = true;
        }
        while (!done);
    }
}
