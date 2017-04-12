package com.sanjan.algorithms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        String timeStamp=new SimpleDateFormat("yyyy/MM/dd hh.mm.ss").format(Calendar.getInstance().getTime());
        System.out.println("Cur dt= "+timeStamp+"\nProgrammed by Gaurav");

        AccountHolder Gaurav=new AccountHolder(1000);
        System.out.println("Enter deposit amount");
        double amount=input.nextDouble();
        Gaurav.deposit(amount);

        System.out.println("Enter Withdraw amount");
        double withDraw=input.nextDouble();
        Gaurav.withDraw(withDraw);
        System.out.println("Enter interest ");
        int interest=input.nextInt();
        updateList(Gaurav,interest);


    }


    public static void updateList(AccountHolder Gaurav,int interest){


        AccountHolder.modifyMonthlyInterest(interest);
        System.out.println("Account balance with Interest");
        System.out.println("Base "+String.format("%.2f",Gaurav.getBalance()));
        for(int i=1;i<=12;i++){
            Gaurav.monthlyInterest();
            System.out.println("Month "+i+": $"+Gaurav);

        }

        System.out.println("After setting interest rate to "+((interest+1)/100)
        +" and calculating monthly interest \n"
        +"Balances \n"+"Account balance with Interest ");
        AccountHolder.modifyMonthlyInterest(interest+1);
        Gaurav.monthlyInterest();
        System.out.println(Gaurav);

    }
}
