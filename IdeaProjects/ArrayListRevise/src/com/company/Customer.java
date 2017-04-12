package com.company;

/**
 * Created by sanja on 3/28/2017.
 */

import java.util.*;
public class Customer {

    private String customerName;
    private ArrayList<Double> doublesTransactions;

    public Customer(String customerName, double amount) {
        this.customerName = customerName;
        this.doublesTransactions=new ArrayList<>();
        addTransactions(amount);
    }


    public boolean addTransactions(double amount){

        return this.doublesTransactions.add(amount);
    }


    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getDoublesTransactions() {
        return doublesTransactions;
    }
}
