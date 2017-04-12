package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        double amount=10000d;
        for(double i=8;i>=2;i--){

            System.out.println(String.format("%.2f",calculateInterest(amount,i)));

        }

    }

    public static double calculateInterest(double amount,double interest) {

        return(amount*(interest/100d));

    }
}
