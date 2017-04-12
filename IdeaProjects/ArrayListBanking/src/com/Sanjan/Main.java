package com.Sanjan;

public class Main {

    public static void main(String[] args) {


        Bank nkgsb=new Bank("nkgsb");
        nkgsb.addBranch("mulund");
        nkgsb.addNewCustomer("mulund","sanjan",50);
        nkgsb.addNewCustomer("mulund","niranjan",50);
        nkgsb.addNewCustomer("mulund","anupama",50);
        nkgsb.addNewCustomer("mulund","harihar",50);
        nkgsb.addNewCustomer("mulund","sanjan",50);
        nkgsb.addCustomerTransaction("mulund","sanjan",50);
        nkgsb.listCustomers("mulund");
        System.out.println("==================================================");
        nkgsb.addBranch("thane");
        nkgsb.addNewCustomer("thane","sanjan",50);
        nkgsb.addNewCustomer("thane","niranjan",50);
        nkgsb.addNewCustomer("thane","anupama",50);
        nkgsb.addNewCustomer("thane","harihar",50);
        nkgsb.addNewCustomer("thane","sanjan",50);
        nkgsb.addCustomerTransaction("thane","sanjan",50);
        nkgsb.listCustomers("thane");


        if(!nkgsb.addNewCustomer("mulund","sanjan",50)){
            System.out.println("already present");
        }

    }
}
