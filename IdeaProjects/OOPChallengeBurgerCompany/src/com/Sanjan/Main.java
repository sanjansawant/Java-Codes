package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        BasicHamburger hamburger1=new BasicHamburger("flatbread",5.5,"beef");
        hamburger1.setCount(4);
        hamburger1.addItem("tomato",2);
        System.out.println(hamburger1.getPrice());
        hamburger1.addItem("tomato",2);
        System.out.println(hamburger1.getPrice());
        hamburger1.addItem("tomato",2);
        System.out.println(hamburger1.getPrice());
        hamburger1.addItem("tomato",2);
        System.out.println(hamburger1.getPrice());
        hamburger1.addItem("tomato",2);
        System.out.println(hamburger1.getPrice());

        System.out.println("=======================================");

        HealthyBurger hamburger2=new HealthyBurger(10,"beef");

        hamburger2.addItem("coo",2);
        System.out.println(hamburger2.getPrice());
        hamburger2.addItem("coo",2);
        System.out.println(hamburger2.getPrice());
        hamburger2.addItem("coo",2);
        System.out.println(hamburger2.getPrice());
        hamburger2.addItem("coo",2);
        System.out.println(hamburger2.getPrice());
        hamburger2.addItem("coo",2);
        System.out.println(hamburger2.getPrice());
        hamburger2.addItem("coo",2);
        System.out.println(hamburger2.getPrice());
        hamburger2.addItem("coo",2);
        System.out.println(hamburger2.getPrice());

        System.out.println("=======================================");

        DeluxeHamburger hamburger3=new DeluxeHamburger("proper",10,"beef");

        hamburger3.addItem("coo",2);
        System.out.println(hamburger3.getPrice());
    }
}
