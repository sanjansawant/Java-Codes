package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class BankAccount {

    private String accountNumber;
    private double balance;
    private String email;
    private String customerName;
    private String phoneNumber;
    public BankAccount(){
        this("default",0.0,"default","default","default");
        System.out.println("empty constructor called");

    }

    public BankAccount(String email, String customerName, String phoneNumber) {
        this("default",100.55,email,customerName,phoneNumber);

    }

    public BankAccount(String accountNumber, double balance, String email, String customerName, String phoneNumber){

        this.accountNumber=accountNumber;
        this.balance=0;
        this.email=email;
        this.customerName=customerName;
        this.phoneNumber=phoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public void setWithdrawFunds(double amount) {

        if (amount > 0) {
            if ((this.balance - amount) >= 0) {

                this.balance -= amount;
            } else {
                System.out.println("amount gretaer than the balance");
            }
        }else{
            System.out.println("please enter amount greater than 0");
        }
    }

    public double getWithdrawFunds() {

        return this.balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
