package com.company;

/**
 * Created by sanja on 3/28/2017.
 */
import java.util.*;
public class Mobile {
    private String name;
    private ArrayList<Contact> contacts;

    public Mobile(String name) {
        this.name = name;
        this.contacts=new ArrayList<>();
    }

    public boolean addContact(Contact contact){

        if(findContact(contact.getName())){
            System.out.println("here");
            int number=getIndex(contact);

            //System.out.println(getIndex(contact)+" "+contacts.get(number)+" is already in the list cannot be added again");
            return false;

        }contacts.add(contact);
        return true;
    }



    public boolean modifyContact(Contact oldContact, Contact newContact){

        if(findContact(oldContact.getName())){

            if(findContact(newContact.getName())){

                System.out.println(newContact.getName()+" is already in the list");
                return false;
            }else{

                int number=getIndex(oldContact);
                contacts.set(number,newContact);
                System.out.println(newContact.getName()+" set at position at "+number);
                return true;
            }

        }else{

            System.out.println(oldContact.getName()+" not found");
            return false;
        }



    }


    public void displayContact(){


        for(Contact contact:contacts){

            System.out.println(contact);
        }


    }


    public boolean removeContact(Contact contact){

        if(findContact(contact.getName())){
            int number=getIndex(contact);
            System.out.printf("removing "+contacts.get(number));
            contacts.remove(contact);
            return true;
        }
        System.out.println("Contact is not in the list"+contact.getName());
        return false;


    }


    private boolean findContact(String contact){

        for(Contact con:contacts){

            if(con.getName().equals(contact)){
                return true;
            }

        }
        return false;

    }

    private int getIndex(Contact contact){

        return contacts.indexOf(contact);

    }






}
