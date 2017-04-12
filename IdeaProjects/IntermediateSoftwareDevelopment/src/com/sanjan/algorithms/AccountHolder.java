package com.sanjan.algorithms;

/**
 * Created by sanja on 1/27/2017.
 */
public class AccountHolder {

    private static double annualInterestRate;
    private double balance;

    public AccountHolder(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){

        if(amount>0){
            this.balance+=amount;
        }
    }

    public void withDraw(double amount){

        if(balance-amount<500){

            if(this.balance-amount-50<100){
                System.out.println("Amount less than 100$ cannot go ahead ");
            }else{
                this.balance=this.balance-amount-50;
            }
        }else{
            this.balance=this.balance-amount;

        }


    }


    public void monthlyInterest(){

        this.balance+=this.balance*(annualInterestRate/12.0);

    }

    public static void modifyMonthlyInterest(double updateInterest){
        if(updateInterest>0) {
            annualInterestRate = updateInterest/100;
        }
    }
    @Override
    public String toString(){
        return String.format("%.2f",this.balance);
    }

    public double getBalance() {
        return balance;
    }
}
