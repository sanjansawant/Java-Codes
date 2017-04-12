package com.Sanjan;

import java.util.ArrayList;

/**
 * Created by sanja on 1/4/2017.
 */
public class MobilePhone {

    private ArrayList<Contacts> contact =new ArrayList<>();

    public MobilePhone(ArrayList<Contacts> contact) {
        this.contact = contact;
    }

    public boolean addNewContact(Contacts nameC){

        if(find(nameC)){

            System.out.println("Number is already in the list");
            return false;
        }else{


            contact.add(nameC);
            System.out.println(nameC.getName()+" successfully added");
            return true;
        }

    }


    public boolean updateContact(Contacts oldName,Contacts newName){

        if(find(oldName)){

            int position=getPosition(oldName);
            if(position>=0){
                contact.set(position,newName);
                return true;
            }else{
                System.out.println("item not found");
                return false;
            }

        }else{
            return false;
        }

    }



    public boolean removeContact(Contacts name){


        int position=getPosition(name);
        if(position>=0){
            contact.remove(position);
            return true;
        }else{
            return false;
        }

    }

    private int getPosition(Contacts name){

        return(this.contact.indexOf(name));
    }


    public boolean find(Contacts nameC){

        String name=nameC.getName();
        for(int i=0;i<this.contact.size();i++){

            if(contact.get(i).getName().equalsIgnoreCase(name)){

                return true;
            }
        }return false;
    }

    public String queryContact(Contacts contact){
        if(find(contact)){
            return contact.getName();

        }else{
            return null;
        }

    }



    public void getContact() {

        for(int i=0;i<contact.size();i++){

            System.out.println(contact.get(i).getName()+ " ==> "+contact.get(i).getPhoneNumber());

        }


    }
}
