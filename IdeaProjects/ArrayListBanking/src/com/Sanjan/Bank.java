package com.Sanjan;

/**
 * Created by sanja on 1/4/2017.
 */

import java.util.*;

public class Bank {
    private Scanner input=new Scanner(System.in);
    private ArrayList<Branch> newBranch;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.newBranch = new ArrayList<>();
    }

    public boolean addBranch(String branch) {

        if (find(branch)) {
            System.out.println("Branch is already present");
            return false;
        } else {
            Branch newBranch1 = new Branch(branch);
            newBranch.add(newBranch1);
            return true;
        }
    }

    private boolean find(String branch) {

        for (int i = 0; i < newBranch.size(); i++) {

            if (newBranch.get(i).getName().equalsIgnoreCase(branch)) {
                return true;
            }

        }
        return false;


    }

    private Branch getBranch(String branch) {

        for (int i = 0; i < newBranch.size(); i++) {

            if (newBranch.get(i).getName().equalsIgnoreCase(branch)) {
                return newBranch.get(i);
            }
        }
        System.out.println("branch not present");
        return null;

    }


    public boolean addNewCustomer(String branch, String customer, double amount) {
        if (getBranch(branch) != null) {

            Branch present = getBranch(branch);
            return present.addNewCustomer(customer, amount);

        } else {

            return false;
        }
    }

    public boolean addCustomerTransaction(String branch, String customer, double amount) {

        if (getBranch(branch) != null) {

            Branch present = getBranch(branch);
            return present.addCustomerTransactions(customer, amount);

        } else {

            return false;
        }
    }


    public boolean listCustomers(String branch) {
        System.out.println("DO you want to see transactions");
        int number=input.nextInt();

        if (getBranch(branch) != null) {
            Branch present = getBranch(branch);
            System.out.println(present.getName());
            ArrayList<Customer> display = present.returnCustomer();
            if (display == null) {
                System.out.println("nothing in the list");
                return false;
            } else {
                for (int i = 0; i < display.size(); i++) {

                    System.out.print(display.get(i).getName() + "==>" );

                    if(number==1){
                        System.out.println("Transactions");
                        System.out.print(display.get(i).getTransactions());


                    }
                    System.out.println();
                }

                return true;
            }
        }

        return false;
    }


    //addcustomertransactions
    //listcustomers


}
