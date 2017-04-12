package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("constructors with 3 parameters called");
    }



    public VipCustomer(double creditLimit, String email) {
        this("default",creditLimit,email);
        System.out.println("constructors with 2 parameters called");
    }

    public VipCustomer(){
        this("default",0.0,"default");
        System.out.println("empty constructor called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
