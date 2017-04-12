package com.Sanjan;

/**
 * Created by sanja on 1/4/2017.
 */

import java.util.*;

public class Branch {

    private ArrayList<Customer> newCustomer;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.newCustomer = new ArrayList<>();
    }

    public boolean addNewCustomer(String name, double amount) {

        if (find(name)) {
            System.out.println("customer already present");
            return false;
        } else {

            Customer new1 = new Customer(name, amount);
            newCustomer.add(new1);
            return true;
        }

    }


    public boolean addCustomerTransactions(String name, double amount) {

        if (find(name)) {

            Customer new1 = getCustomer(name);
            new1.addTransaction(amount);
            return true;
        } else {
            System.out.println("customer not in database");
            return false;
        }

    }

    private Customer getCustomer(String name) {
        for (int i = 0; i < newCustomer.size(); i++) {

            if (newCustomer.get(i).getName().equalsIgnoreCase(name)) {
                return newCustomer.get(i);
            }
        }
        return null;

    }


    private boolean find(String customer) {

        for (int i = 0; i < newCustomer.size(); i++) {

            if (newCustomer.get(i).getName().equalsIgnoreCase(customer)) {
                return true;
            }

        }
        return false;
    }

    public ArrayList<Customer> returnCustomer(){

        return newCustomer;

    }

    public String getName() {
        return name;
    }
}
