package com.Sanjan;

/**
 * Created by sanja on 1/4/2017.
 */
public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts newContact(String name, String phoneNumber){

        return (new Contacts(name,phoneNumber));
    }
}

