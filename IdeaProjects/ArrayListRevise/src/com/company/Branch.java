package com.company;

/**
 * Created by sanja on 3/28/2017.
 */

import java.util.*;
public class Branch {

    private String name;
    private ArrayList<Customer> customerInBranch;

    public Branch(String name) {
        this.name = name;
        this.customerInBranch=new ArrayList<>();
    }

    public boolean addNewCustomer(String cname, double initialAmount){

        if(findCustomer(cname)){
            System.out.println("customer already present");
            return false;
        }customerInBranch.add(new Customer(cname,initialAmount));
        return true;
    }




    private Customer getCustomer(String cname){


        for(Customer customer:customerInBranch){

            if(customer.getCustomerName().equals(cname)){
                return customer;
            }
        }return null;
    }

    public boolean addCustomerTransaction(String cname, double amount){

        if(findCustomer(cname)){

            Customer customer=getCustomer(cname);
            return customer.addTransactions(amount);

        }return false;
    }


    private boolean findCustomer(String fName){

        for(Customer customer:customerInBranch){

            if(customer.getCustomerName().equals(fName)){
                return true;
            }

        }return false;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerInBranch() {
        return customerInBranch;
    }
}
