package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        BankAccount sanjan=new BankAccount();//purpose isto physically create object for us//bankaccount() is constructor
        //and this is a special method that creates class
        BankAccount niranjan=new BankAccount("12121",453.342,"323@email.com",
                "niranjan","232-232-2323");
        sanjan.setWithdrawFunds(50);

        System.out.println(sanjan.getBalance());
        sanjan.setBalance(50);
        sanjan.setBalance(50);
        System.out.println(sanjan.getBalance());
        sanjan.setWithdrawFunds(50);
        System.out.println(sanjan.getBalance());
        sanjan.setWithdrawFunds(50);
        System.out.println(sanjan.getBalance());
        sanjan.setWithdrawFunds(0);
        System.out.println(sanjan.getBalance());
        System.out.println(sanjan.getCustomerName());

        BankAccount anupama=new BankAccount("anu@gamil.com","anupama","222,222,2222");
        System.out.println(anupama.getCustomerName()+"   "+anupama.getPhoneNumber());
    }
}
