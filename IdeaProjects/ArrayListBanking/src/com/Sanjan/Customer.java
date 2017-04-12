package com.Sanjan;

/**
 * Created by sanja on 1/4/2017.
 */
import java.util.*;
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions=new ArrayList<>();
        addTransaction(transaction);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions.toString() +
                '}';
    }

    public void addTransaction(double amount){

        this.transactions.add(Double.valueOf(amount));
        System.out.println("successfully added amount");

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        ArrayList<Double> newList=new ArrayList<>();
        for(int i=0;i<transactions.size();i++){

            newList.add(transactions.get(i).doubleValue());


        }
        return newList;
    }
}
