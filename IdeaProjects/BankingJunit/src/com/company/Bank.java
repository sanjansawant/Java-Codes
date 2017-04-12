package com.company;

/**
 * Created by sanja on 4/1/2017.
 */
public class Bank{

    private String firstName;
    private String lastName;
    private double balance;
    public static final int CHECKING=1;
    public static final int SAVINGS=2;
    private int accountType;

    public Bank(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType=accountType;
    }

    //if branch==true; teller
    //if branch==false;atm

    public double deposit(double amount, boolean branch){



        this.balance+=amount;
        return this.balance;

    }

    //if branch==true; teller
    //if branch==false;atm
    public double withdraw(double amount, boolean branch){
        if(amount>500 && !branch){
            throw new IllegalArgumentException();
        }

        this.balance-=amount;
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking(){

        return accountType==CHECKING;
    }
    //more methods

}
