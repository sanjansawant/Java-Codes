package com.Sanjan;

import java.util.*;

/**
 * Created by sanja on 1/9/2017.
 */
public class Account {
    private String name;
    private int balance=0;
    private ArrayList<Integer> transactions;

    public Account(String name) {
        this.name = name;
        this.transactions=new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){

        if(amount>0){
            this.transactions.add(amount);
            System.out.println(amount+" is deposited");


        }else{
            System.out.println("cannot deposit negative value");
        }
    }

    public void withdraw(int amount){

        int withdrawal=-amount;
        if(withdrawal<0){
            this.transactions.add(withdrawal);
            System.out.println(amount+" withdrawn");

        }else{
            System.out.println("cannot withdraw negative value");
        }
    }

    public void calculateBalance(){

        for(int i:this.transactions){

            this.balance+=i;
        }

        System.out.println("balance is "+this.balance);
    }


}
