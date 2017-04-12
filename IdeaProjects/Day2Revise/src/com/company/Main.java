package com.company;

public class Main {

    public static void main(String[] args) {


        DeluxeHamburger hamburger=new DeluxeHamburger("beef",2.2);
        hamburger.setItem1("tomato",2.3);
        hamburger.setItem2("potato",2.4);
        hamburger.setItem3("onion",2.5);
        hamburger.setItem4("papaya",2.6);
        System.out.println(hamburger.getPrioe());
    }


}
