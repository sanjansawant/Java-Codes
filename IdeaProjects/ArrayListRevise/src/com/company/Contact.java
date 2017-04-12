package com.company;

/**
 * Created by sanja on 3/28/2017.
 */
public class Contact {

    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "anme='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


    public static Contact createContact(String name, String number){
        return new Contact(name,number);

    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
