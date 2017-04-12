package com.company;

/**
 * Created by sanja on 3/28/2017.
 */
import java.util.*;
public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches=new ArrayList<>();
    }

    public boolean addBranch(String name){

        if(findBranch(name)){

            System.out.println("Branch is already present");
            return false;
        }

        branches.add(new Branch(name));
        System.out.println(name+" "+branches.size());
        return true;


    }


    public boolean addCustomer(String bName,String cName, double amount){

        if(findBranch(bName)){

            Branch branch=getBranch(bName);
            System.out.println(branch.getName()+" "+cName);
            return branch.addNewCustomer(cName,amount);

        }return false;

    }

    public boolean addCustomerTransaction(String bName,String cName, double amount){


        if(findBranch(bName)){

            Branch branch=getBranch(bName);

            return branch.addCustomerTransaction(cName,amount);

        }return false;

    }

    public void listCustomers(String name, boolean condition){

        Branch branch=getBranch(name);
        if (branch != null) {
            //System.out.println("here");
            if (!condition) {

                ArrayList<Customer> customers = branch.getCustomerInBranch();

                for (Customer customer : customers) {

                    System.out.println(customer.getCustomerName());
                }
            }else{

                ArrayList<Customer> customers = branch.getCustomerInBranch();

                for (Customer customer : customers) {

                    System.out.println(customer.getCustomerName());

                    for(Double amount:customer.getDoublesTransactions()){
                        //System.out.println("here");
                        System.out.printf(" "+amount);
                    }
                    System.out.println();
                }

            }
        }else{
            System.out.println("branch not present");
        }



    }


    private boolean findBranch(String name){

        for(Branch branch:branches){

            if(branch.getName().equals(name)){
                return true;
            }
        }
        return false;
    }


    private Branch getBranch(String name){

        for(Branch branch:branches){

            if(branch.getName().equals(name)){
                return branch;
            }
        }return null;


    }

}
