package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        Account sanjan=new Account("sanjan");
        sanjan.deposit(1000);
        sanjan.deposit(-20);
        sanjan.withdraw(500);
        sanjan.withdraw(-200);
        sanjan.calculateBalance();
        System.out.println("balance of "+sanjan.getName()+" is "+sanjan.getBalance());
    }
}
