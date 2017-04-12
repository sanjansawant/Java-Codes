package com.company;

public class Main {

    private static Mobile mobile=new Mobile("Sanjan");
    public static void main(String[] args) {

        mobile.addContact(Contact.createContact("Sanjan","5512259961"));
        mobile.addContact(Contact.createContact("Niranjan","5212131"));
        mobile.addContact(Contact.createContact("Anupama","9869412914"));
        mobile.addContact(Contact.createContact("Harihar","9322550302"));

        mobile.displayContact();
        System.out.println("===========");
        mobile.addContact(Contact.createContact("Niranjan","5212131"));
        mobile.displayContact();


    }
}
