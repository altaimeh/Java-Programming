package com.company;
import java.util.Scanner;
import java.util.Arrays;

//Al-Taimee Hassan
//gf6417



public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean done = false;
        do {
            System.out.println("Hi There! Welcome to Project 1 Console Application");
            System.out.println("***************************************************");
            System.out.println("What is your name? (No Spaces Please) : ");
            Scanner input = new Scanner(System.in);
            String name = input.next();
            System.out.println("Hi there " + name);
            System.out.println("Please select from the following options to test features of Project 1! ");
            System.out.println("1. Press 1 to test Student class");
            System.out.println("2. Press 2 to test Person class");
            System.out.println("3. Press 3 to test Matrix class");
            System.out.println("4. Press 4 to test Bank Account class");
            System.out.println("5. Press 5 to test Date Class");
            System.out.println("6. Press 6 to start over");
            System.out.println("Press 7 or any other character to close application");
            int choice = input.nextInt();
            if(choice == 1) {
                System.out.println("Welcome to Student class!");
                System.out.println("************************");
                Student[] input1 = {
                        new Student(1045, "Monwarul Slime", 21),
                        new Student(3564, "Ali Islam", 18),
                        new Student(9923, "Faiyaz Chakroborty", 19),
                        new Student(1183, "Ashraf James", 21),
                        new Student(9365, "Taimee Harden", 20)
                };
                System.out.println("Class : ");
                helper_print_students(input1);
                System.out.println();
                System.out.println("Students age increased by 1 : ");
                for(int i = 0; i < input1.length; i++) {
                    input1[i].setAge(input1[i].getAge() + 1);
                    System.out.println(input1[i]);
                }
                System.out.println();
                System.out.println("Students greater than 20 years old : ");
                int temp_counter = 0;
                for (int i = 0; i < input1.length; i++) {
                    if(input1[i].getAge() > 20) {
                        System.out.println(input1[i]);
                        temp_counter++;
                    }
                    else {
                        System.out.println("This student is not older than 20 years old. ");
                    }
                }
                System.out.println();
                System.out.println("1. Press 1 if you would like to try with your own inputs");
                System.out.println("2. Press 2 or any other character to go back to home page");
                int choiceB = input.nextInt();
                if(choiceB == 1) {
                    System.out.println("Welcome to Student class!");
                    System.out.println("************************");
                    System.out.println("Please enter an ID for student 1 : ");
                    int id1 = input.nextInt();
                    System.out.println("Please enter a name for student 1 (No spaces please) : ");
                    String name1 = input.next();
                    System.out.println("Please enter an age for student 1 : ");
                    int age1 = input.nextInt();
                    System.out.println("************************");
                    System.out.println("Please enter an ID for student 2 : ");
                    int id2 = input.nextInt();
                    System.out.println("Please enter a name for student 2 (No spaces please) : ");
                    String name2 = input.next();
                    System.out.println("Please enter an age for student 2 : ");
                    int age2 = input.nextInt();
                    System.out.println("************************");
                    System.out.println("Please enter an ID for student 3 : ");
                    int id3 = input.nextInt();
                    System.out.println("Please enter a name for student 3 (No spaces please) : ");
                    String name3 = input.next();
                    System.out.println("Please enter an age for student 3 : ");
                    int age3 = input.nextInt();
                    System.out.println("************************");
                    System.out.println("Please enter an ID for student 4 : ");
                    int id4 = input.nextInt();
                    System.out.println("Please enter a name for student 4 (No spaces please) : ");
                    String name4 = input.next();
                    System.out.println("Please enter an age for student 4 : ");
                    int age4 = input.nextInt();
                    System.out.println("************************");
                    System.out.println("Please enter an ID for student 5 : ");
                    int id5 = input.nextInt();
                    System.out.println("Please enter a name for student 5 (No spaces please) : ");
                    String name5 = input.next();
                    System.out.println("Please enter an age for student 5 : ");
                    int age5 = input.nextInt();
                    System.out.println("************************");
                    Student[] input2 = {
                            new Student(id1, name1, age1),
                            new Student(id2, name2, age2),
                            new Student(id3, name3, age3),
                            new Student(id4, name4, age4),
                            new Student(id5, name5, age5)
                    };
                    System.out.println("Class : ");
                    helper_print_students(input2);
                    System.out.println();
                    System.out.println("Students age increased by 1 : ");
                    for(int i = 0; i < input2.length; i++) {
                        input2[i].setAge(input2[i].getAge() + 1);
                        System.out.println(input2[i]);
                    }
                    System.out.println();
                    System.out.println("Students greater than 20 years old : ");
                    int temp_counter_b = 0;
                    for (int i = 0; i < input2.length; i++) {
                        if(input2[i].getAge() > 20) {
                            System.out.println(input2[i]);
                            temp_counter_b++;
                        }
                        else {
                            System.out.println("This student is not older than 20 years old. ");
                        }
                    }
                    System.out.println();
                    System.out.println("1. Press 1 if you would like to go back to home page");
                    System.out.println("2. Press 2 or any other character to go back to quit");
                    int choiceC = input.nextInt();
                    if(choiceC == 1) {
                        continue;
                    }
                    done = true;
                }
                done = true;
            }
            if(choice == 2) {
                System.out.println("Welcome to Person class!");
                System.out.println("Where you can create your own family! ");
                System.out.println("************************");
                System.out.println("Test data sample : ");
                Person child1 = new Person(20, "Taimee", "Male");
                Person parent = new Person(26, "Thanjila", "Female");
                Person child2 = new Person(24, "Mahfus", "Male");
                parent.setChildren(child1);
                parent.setChildren(child2);
                parent.increaseAge();
                System.out.println("Parent : " + parent.getName());
                System.out.println("Age : " + parent.getAge());
                System.out.println("Gender : " + parent.getGender());
                System.out.println("Children : ");
                for(Person temp : parent.getChildren()) {
                    System.out.print(" [ " + temp.getName() + " ] ");
                    System.out.println("Age : " + temp.getAge());
                }
                System.out.println();
                System.out.println("1. Press 1 if you would like to try with your own inputs");
                System.out.println("2. Press 2 or any other character to go back to home page");
                int choiceB = input.nextInt();
                if(choiceB == 1) {
                    System.out.println("Welcome to Person class!");
                    System.out.println("************************");
                    System.out.println("Please enter a parent name (No Spaces Please) : ");
                    String parent2 = input.next();
                    System.out.println("Please enter the parent age : ");
                    int parent2_age = input.nextInt();
                    System.out.println("Please enter parent gender : ");
                    String parent2_gender = input.next();
                    System.out.println("************************");
                    System.out.println("Please enter a child 1 name (No Spaces Please) : ");
                    String child3 = input.next();
                    System.out.println("Please enter the child 1 age : ");
                    int child3_age = input.nextInt();
                    System.out.println("Please enter child 1 gender : ");
                    String child3_gender = input.next();
                    System.out.println("************************");
                    System.out.println("Please enter a child 2 name (No Spaces Please) : ");
                    String child4 = input.next();
                    System.out.println("Please enter the child 2 age : ");
                    int child4_age = input.nextInt();
                    System.out.println("Please enter child 2 gender : ");
                    String child4_gender = input.next();
                    System.out.println("Test data sample : ");
                    Person child3_b = new Person(child3_age, child3, child3_gender);
                    Person parent2_b = new Person(parent2_age, parent2, parent2_gender);
                    Person child4_b = new Person(child4_age, child4, child4_gender);
                    parent2_b.setChildren(child3_b);
                    parent2_b.setChildren(child4_b);
                    parent2_b.increaseAge();
                    System.out.println("Parent : " + parent2_b.getName());
                    System.out.println("Age : " + parent2_b.getAge());
                    System.out.println("Gender : " + parent2_b.getGender());
                    System.out.println("Children : ");
                    for(Person temp : parent2_b.getChildren()) {
                        System.out.print(" [ " + temp.getName() + " ] ");
                        System.out.println("Age : " + temp.getAge());
                    }
                    System.out.println();
                    System.out.println("1. Press 1 if you would like to go back to home page");
                    System.out.println("2. Press 2 or any other character to quit");
                    int choiceC = input.nextInt();
                    if(choiceC == 1) {
                        continue;
                    }
                }
                done = true;
            }
            if(choice == 3) {
                System.out.println("Welcome to Matrix class!");
                System.out.println("************************");
                Matrix temp1 = new Matrix();
                Matrix temp2 = new Matrix();
                System.out.println("Test Matrix 1 : ");
                temp1.random_matrix();
                System.out.println("Test Matrix 2 : ");
                temp2.random_matrix();
                Matrix adding = temp1.add_matrices(temp2);
                System.out.println("Test Add Matrices : ");
                adding.print_add_matrix();
                System.out.println("1. Press 1 if you would like to try with your own inputs");
                System.out.println("2. Press 2 or any other character to go back to home page");
                int choiceB = input.nextInt();
                if(choiceB == 1) {
                    System.out.println("Welcome to Matrix class!");
                    System.out.println("************************");
                    System.out.println("Please enter integer dimensions for Matrix 1: ");
                    System.out.println("------------------------------------------------\n");

                    System.out.println("Please enter row size for Matrix 1: ");
                    System.out.println("------------------------------------------------\n");
                    int rowSize1 = input.nextInt();

                    System.out.println("Please enter column size for Matrix 1: ");
                    System.out.println("------------------------------------------------\n");
                    int colSize1 = input.nextInt();

                    System.out.println("Please enter row size for Matrix 2: ");
                    System.out.println("------------------------------------------------\n");
                    int rowSize2 = input.nextInt();

                    System.out.println("Please enter column size for Matrix 2: ");
                    System.out.println("------------------------------------------------\n");
                    int colSize2 = input.nextInt();
                    if (colSize1 != rowSize2) {
                        System.out.println("Error! Cannot add these matrices!");
                        System.out.println("Please try again!");
                        System.exit(1);
                    }

                    int[][] temp_matrix1 = new int[rowSize1][colSize1];
                    int[][] temp_matrix2 = new int[rowSize2][colSize2];

                    Matrix user_input = new Matrix();
                    Matrix user_input2 = new Matrix();

                    user_input.read_matrix_1(temp_matrix1);
                    user_input2.read_matrix_2(temp_matrix2);

                    Matrix result = user_input.add_matrices(user_input2);

                    System.out.println("Test Add Matrices : ");
                    result.print_add_matrix();
                }
                done = true;
            }
            if(choice == 4) {
                System.out.println("Welcome to BankAccount class!");
                System.out.println("Where you can create your own account! ");
                System.out.println("************************");
                BankAccount account1 = new BankAccount("Taimee", 45341045, 101222);
                account1.getBalance();
                account1.deposit_to_bank(22);
                account1.withdraw_from_bank(12);
                System.out.println();
                System.out.println("1. Press 1 if you would like to try with your own inputs");
                System.out.println("2. Press 2 or any other character to go back to home page");
                int choiceB = input.nextInt();
                if(choiceB == 1) {
                    System.out.println("Welcome to BankAccount class!");
                    System.out.println("Where you can create your own account! ");
                    System.out.println("************************");
                    System.out.println("Enter an account name (No spaces please) : ");
                    String getAccountHolder = input.next();
                    System.out.println("Enter an account ID (Numbers only) : ");
                    int getAccountID = input.nextInt();
                    System.out.println("Please enter a balance : ");
                    double getBalance = input.nextDouble();
                    System.out.println("Please enter amount you would like to deposit : ");
                    double getDeposit = input.nextDouble();
                    System.out.println("Please enter amount you would like to withdraw : ");
                    double getWithdraw = input.nextDouble();
                    System.out.println("************************");
                    BankAccount account2 = new BankAccount(getAccountHolder, getAccountID, getBalance);
                    account2.getBalance();
                    account2.deposit_to_bank(getDeposit);
                    account2.withdraw_from_bank(getWithdraw);
                    System.out.println();
                    System.out.println("1. Press 1 if you would like to go back to home page");
                    System.out.println("2. Press 2 or any other character to quit");
                    int choiceC = input.nextInt();
                    if(choiceC == 1) {
                        continue;
                    }
                    done = true;
                }
                done = true;
            }
            if(choice == 5) {
                System.out.println("Welcome to Calendar Date Class! ");
                System.out.println("Where you can print dates! ");
                System.out.println("************************");
                String temp_month;
                int temp_input_day = 0;
                int temp_input_month = 0;
                int temp_input_year = 0;
                boolean temp_loop_A = false;
                boolean temp_loop_B = false;
                boolean temp_loop_C = false;
                System.out.println("Please enter your birth date in the format mm/dd/yyyy : ");
                System.out.println("Month : ");
                temp_input_month = input.nextInt();
                System.out.println("You entered : " + temp_input_month + " as the month\n");
                if (temp_input_month <= 0 || temp_input_month > 12) {
                    System.out.println("Error! Your input months has to be a valid input");
                    while (!(temp_input_month >= 1 && temp_input_month <= 12)) {
                        System.out.println("Month : ");
                        temp_input_month = input.nextInt();
                        System.out.println("You entered : " + temp_input_month + " as the month\n");
                    }
                    temp_loop_A = true;
                }
                System.out.println("************************");
                System.out.println("Day : ");
                temp_input_day = input.nextInt();
                System.out.println("You entered : " + temp_input_day + " as the day\n");
                if(temp_input_month == 9 || temp_input_month == 4 || temp_input_month == 6 || temp_input_month == 11) {
                    if(temp_input_day > 30) {
                        System.out.println("Error! Your input days has to be a valid input");
                        while(!(temp_input_day >= 1 && temp_input_day <= 31)) {
                            System.out.println("Day : ");
                            temp_input_day = input.nextInt();
                            System.out.println("You entered : " + temp_input_day + " as the day\n");
                        }
                        temp_loop_B = true;
                    }
                }
                if(temp_input_month == 1 || temp_input_month == 3 || temp_input_month == 5 || temp_input_month == 7
                        || temp_input_month == 8 || temp_input_month == 10 || temp_input_month == 12) {
                    if(temp_input_day > 31) {
                        System.out.println("Error! Your input days has to be a valid input");
                        while(!(temp_input_day >= 1 && temp_input_day <= 31)) {
                            System.out.println("Day : ");
                            temp_input_day = input.nextInt();
                            System.out.println("You entered : " + temp_input_day + " as the day\n");
                        }
                        temp_loop_B = true;
                    }
                }

                if(temp_input_day > 31 || temp_input_day <= 0) {
                    System.out.println("Error! Your input days has to be a valid input");
                    while(!(temp_input_day >= 1 && temp_input_day <= 31)) {
                        System.out.println("Day : ");
                        temp_input_day = input.nextInt();
                        System.out.println("You entered : " + temp_input_day + " as the day\n");
                    }
                    temp_loop_B = true;
                }

                if(temp_input_month == 2) {
                    if(temp_input_day > 29) {
                        System.out.println("Error! Your input days has to be a valid input");
                        while(!(temp_input_day >= 1 && temp_input_day <= 29)) {
                            System.out.println("Day : ");
                            temp_input_day = input.nextInt();
                            System.out.println("You entered : " + temp_input_day + " as the day\n");
                        }
                        temp_loop_B = true;
                    }
                }

                System.out.println("************************");

                System.out.println("Year : ");
                temp_input_year = input.nextInt();
                System.out.println("You entered : " + temp_input_year + " as the year\n");
                if(temp_input_year < 2000) {
                    System.out.println("Please enter a year greater than or equal to 2000");
                    while(!(temp_input_year >= 2000)) {
                        System.out.println("Year : ");
                        temp_input_year = input.nextInt();
                        System.out.println("You entered : " + temp_input_year + " as the year\n");
                    }
                    temp_loop_C = true;
                }
                if((temp_input_year % 4 == 0 && temp_input_year % 100 != 0) || (temp_input_year % 400 == 0)) {
                    if(temp_input_month == 2 && temp_input_day == 29) {
                        System.out.println("Leap Year! Please enter a different year");
                        while(!(temp_input_year >= 2001)) {
                            System.out.println("Year : ");
                            temp_input_year = input.nextInt();
                            System.out.println("You entered : " + temp_input_year + " as the year\n");
                        }
                        temp_loop_C = true;
                    }
                }

                Date final_date = new Date(temp_input_month, temp_input_day, temp_input_year);

                System.out.println("************************");

                System.out.println();
                System.out.println("1. Press 1 if you would like to go back to home page");
                System.out.println("2. Press 2 to see your month outputted as a string");
                System.out.println("3. Press 3 to see your day outputted as a string");
                System.out.println("4. Press 4 or any other character to go back to home page");
                int choiceB = input.nextInt();
                if(choiceB == 1) {
                    continue;
                }
                if(choiceB == 2) {
                    final_date.printMonth(temp_input_month);
                    break;
                }
                if (choiceB == 3) {
                    final_date.printDay(temp_input_day);
                    break;
                }
                done = true;
            }
            if(choice == 6) {
                continue;
            }
            done = true;
        } while (!done);
    }

    public static void helper_print_students(Student[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
