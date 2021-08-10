package com.company;

import java.util.Scanner;

public class Main {

    public static long calculate_factorial(int x) {
        if(x == 0) {
            return 1;
        }
        else {
            return (x * calculate_factorial(x - 1));
        }

    }

    public static void main(String[] args) {
	// write your code here
        boolean done = false;
        do {
            System.out.println("Welcome to factorial calculator! ");
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            String hexException = input.next();
            try {
                if (hexException.startsWith("0x")) {
                    int result = Integer.parseInt(hexException.substring(2), 16);
                    int printResult = (int) calculate_factorial(result);
                    System.out.println("Result : " + printResult);
                } else {
                    int result = Integer.parseInt(hexException);
                    int printResult = (int) calculate_factorial(result);
                    System.out.println("Result : " + printResult);
                }
            } catch (Exception temp) {
                System.out.println("Error! Invalid input! ");
            }
            System.out.println("**********************");
            System.out.println("Please select from the following options to continue");
            System.out.println("1. Press 1 to run it back");
            System.out.println("2. Press 2 or any other character to quit");
            int choice = input.nextInt();
            if (choice == 1) {
                continue;
            }
            done = true;
        } while (!done);
    }
}
