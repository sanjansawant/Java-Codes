package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        VipCustomer sanjan=new VipCustomer();
        System.out.println(sanjan.getCreditLimit());
        System.out.println(sanjan.getEmail());
        System.out.println(sanjan.getName());

        VipCustomer niranjan=new VipCustomer(40.0,"@email.com");
        System.out.println(niranjan.getName());
        System.out.println(niranjan.getCreditLimit());
        System.out.println(niranjan.getEmail());

        VipCustomer anupama=new VipCustomer("anupama",54.4,"@email.com");
        System.out.println(anupama.getEmail());
        System.out.println(anupama.getName());
        System.out.println(anupama.getCreditLimit());

    }
}
