package com.company;

public class BankAccount {
    private String accountHolder;
    private int accountID;
    private double balance;


    BankAccount(String a, int b, double c) {
        this.accountHolder = a;
        this.accountID = b;
        this.balance = c;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String x) {
        accountHolder = x;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int x) {
        accountID = x;
    }

    public void getBalance() {
        System.out.println("Name : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    public void setBalance(int x) {
        balance = x;
    }

    public void withdraw_from_bank(double x) {
        if(x < 0) {
            System.out.println("You cannot withdraw a negative amount! ");
        }
        if(x > balance) {
            System.out.println("Not enough money to withdraw! ");
        }
        else {
            System.out.println("Current balance : " + (balance = balance - x));
        }
    }

    public void deposit_to_bank(double x) {
        if(x < 0) {
            System.out.println("You cannot deposit a negative number! ");
        }
        else {
            System.out.println("Current balance : " + (balance += x));
        }
    }
}
