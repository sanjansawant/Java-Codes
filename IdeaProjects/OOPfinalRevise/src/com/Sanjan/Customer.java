package com.Sanjan;

/**
 * Created by sanja on 1/2/2017.
 */
public class Customer {

    private String name;
    private String accountNumber;
    private int amount;

    public Customer(String name, String accountNumber, int amount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }
}
