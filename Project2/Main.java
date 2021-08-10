package com.company;
import javax.print.Doc;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean done = false;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Hi there! Welcome to project 2");
            System.out.println("Please enter patient's ID : ");
            int getPatient = input.nextInt();
            System.out.println("You have entered : " + getPatient);
            System.out.println("--------------------------");
            System.out.println("Please select from the following options to continue : ");
            System.out.println("1. Press 1 to run it back");
            System.out.println("2. Press 2 to continue");
            System.out.println("3. Press 3 or any other character to quit");
            int choice = input.nextInt();
            if(choice == 1) {
                continue;
            }
            if(choice == 2) {
                System.out.println("Please enter patient's first name : ");
                String getPatientFirstName = input.next();
                System.out.println("You have entered : " + getPatientFirstName);
                System.out.println("--------------------------");
                System.out.println("Please enter patient's last name : ");
                String getPatientLastName = input.next();
                System.out.println("You have entered : " + getPatientLastName);
                System.out.println("--------------------------");
                System.out.println("Please enter doctor's first name : ");
                String getDoctorFirstName = input.next();
                System.out.println("You have entered : " + getDoctorFirstName);
                System.out.println("--------------------------");
                System.out.println("Please enter doctor's last name : ");
                String getDoctorLastName = input.next();
                System.out.println("You have entered : " + getDoctorLastName);
                System.out.println("--------------------------");
                System.out.println("Please enter doctor's specialty : ");
                String getDoctorSpecialty = input.next();
                System.out.println("You have entered : " + getDoctorSpecialty);
                System.out.println("--------------------------");
                System.out.println("**************************");
                Doctor inputDoctor = new Doctor(getDoctorFirstName, getDoctorLastName, getDoctorSpecialty);
                Patient inputPatient = new Patient(getPatientFirstName, getPatientLastName, getPatient,
                        new Date(4, 5, 2000), inputDoctor, new Date(7, 6, 2004),
                        new Date(9, 8, 2005));
                Bill inputBill = new Bill(inputPatient.getPatientID(), 430, 3000, 1230.65);
                System.out.println(inputPatient);
                System.out.println("\n" + inputBill);
                String tempStoreFile = inputPatient.getFirst_name() + inputPatient.getLast_name() + ".txt";
                try {
                    FileWriter inputFile = new FileWriter(new File(tempStoreFile));
                    inputFile.write(inputPatient.toString());
                    System.out.println();
                    inputFile.write("\n" + inputBill);

                    inputFile.close();
                } catch (IOException temp) {
                    System.out.println("Error! ");
                }
                System.out.println("Please select from the following options to continue : ");
                System.out.println("1. Press 1 to run it back");
                System.out.println("2. Press 2 to run it back with your own inputs");
                System.out.println("3. Press 3 or any other character to quit");
                int choiceB = input.nextInt();
                if (choiceB == 1) {
                    continue;
                }
                if (choiceB == 2) {
                    System.out.println("Hi there! Welcome to project 2");
                    System.out.println("Please enter patient's ID : ");
                    int getPatientB = input.nextInt();
                    System.out.println("You have entered : " + getPatientB);
                    System.out.println("--------------------------");
                    System.out.println("Please select from the following options to continue : ");
                    System.out.println("1. Press 1 to run it back");
                    System.out.println("2. Press 2 to continue");
                    System.out.println("3. Press 3 or any other character to quit");
                    int choiceC = input.nextInt();
                    if(choiceC == 1) {
                        continue;
                    }
                    if(choiceC == 2) {
                        System.out.println("Please enter patient's first name : ");
                        String getPatientFirstNameB = input.next();
                        System.out.println("You have entered : " + getPatientFirstNameB);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient's last name : ");
                        String getPatientLastNameB = input.next();
                        System.out.println("You have entered : " + getPatientLastNameB);
                        System.out.println("--------------------------");
                        System.out.println("Please enter doctor's first name : ");
                        String getDoctorFirstNameB = input.next();
                        System.out.println("You have entered : " + getDoctorFirstNameB);
                        System.out.println("--------------------------");
                        System.out.println("Please enter doctor's last name : ");
                        String getDoctorLastNameB = input.next();
                        System.out.println("You have entered : " + getDoctorLastNameB);
                        System.out.println("--------------------------");
                        System.out.println("Please enter doctor's specialty : ");
                        String getDoctorSpecialtyB = input.next();
                        System.out.println("You have entered : " + getDoctorSpecialtyB);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient birth month (int only) : ");
                        int getBirthMonth = input.nextInt();
                        System.out.println("You have entered : " + getBirthMonth);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient birth day (int only) : ");
                        int getBirthDay = input.nextInt();
                        System.out.println("You have entered : " + getBirthDay);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient birth year (int only) : ");
                        int getBirthYear = input.nextInt();
                        System.out.println("You have entered : " + getBirthYear);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient admit month (int only) : ");
                        int getAdmitMonth = input.nextInt();
                        System.out.println("You have entered : " + getAdmitMonth);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient admit day (int only) : ");
                        int getAdminDay = input.nextInt();
                        System.out.println("You have entered: " + getAdminDay);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient admit year (int only) : ");
                        int getAdminYear = input.nextInt();
                        System.out.println("You have entered: " + getAdminYear);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient discharge month (int only) : ");
                        int getDischargeMonth = input.nextInt();
                        System.out.println("You have entered : " + getDischargeMonth);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient discharge day (int only) : ");
                        int getDischargeDay = input.nextInt();
                        System.out.println("You have entered: " + getDischargeDay);
                        System.out.println("--------------------------");
                        System.out.println("Please enter patient discharge year (int only) : ");
                        int getDischargeYear = input.nextInt();
                        System.out.println("You have entered: " + getDischargeYear);
                        System.out.println("--------------------------");
                        System.out.println("Please enter pharmacy charges : ");
                        double getPharmacyCharge = input.nextDouble();
                        System.out.println("You have entered: " + getPharmacyCharge);
                        System.out.println("--------------------------");
                        System.out.println("Please enter room charges : ");
                        double getRoomCharge = input.nextDouble();
                        System.out.println("You have entered: " + getRoomCharge);
                        System.out.println("--------------------------");
                        System.out.println("Please enter doctor fees : ");
                        double getDoctorFee = input.nextDouble();
                        System.out.println("You have entered: " + getDoctorFee);
                        System.out.println("--------------------------");
                        System.out.println("**************************");
                        Doctor inputDoctorB = new Doctor(getDoctorFirstNameB, getDoctorLastNameB, getDoctorSpecialtyB);
                        Patient inputPatientB = new Patient(getPatientFirstNameB, getPatientLastNameB, getPatientB,
                                new Date(getBirthMonth, getBirthDay, getBirthYear), inputDoctorB, new Date(getAdmitMonth,
                                getAdminDay, getAdminYear),
                                new Date(getDischargeMonth, getDischargeDay, getDischargeYear));
                        Bill inputBillB = new Bill(inputPatientB.getPatientID(), getPharmacyCharge, getRoomCharge,
                                getDoctorFee);
                        System.out.println(inputPatientB);
                        System.out.println("\n" + inputBillB);
                        String tempStoreFileB = inputPatientB.getFirst_name() + inputPatientB.getLast_name() + ".txt";
                        try {
                            FileWriter inputFileB = new FileWriter(new File(tempStoreFileB));
                            inputFileB.write(inputPatient.toString());
                            System.out.println();
                            inputFileB.write("\n" + inputBill);
                            inputFileB.close();
                        } catch (IOException tempB) {
                            System.out.println("Error! ");
                        }
                        System.out.println("Please select from the following options to continue : ");
                        System.out.println("1. Press 1 to run it back");
                        System.out.println("2. Press 2 to run it back with your own inputs");
                        System.out.println("3. Press 3 or any other character to quit");
                        int choiceD = input.nextInt();
                        if (choiceD == 1) {
                            continue;
                        }
                        done = true;
                    }
                    done = true;
                }
                done = true;
            }
            done = true;
        } while(!done);
    }
}
