package com.Sanjan;

/**
 * Created by sanja on 1/2/2017.
 */
public class Bank {

    private String name;
    private Customer customer;
    private String establisheddate;
    private int totalEmployees;

    public Bank(String name, Customer customer, String establisheddate, int totalEmployees) {
        this.name = name;
        this.customer = customer;
        this.establisheddate = establisheddate;
        this.totalEmployees = totalEmployees;
    }

    public String getName() {
        return name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getEstablisheddate() {
        return establisheddate;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }
}
