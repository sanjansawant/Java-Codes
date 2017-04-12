package com.Sanjan;
import java.util.*;

public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        MobilePhone sanjan=new MobilePhone();

        Contacts sanjan1=new Contacts("sanjan","551-225-9961");
        Contacts prasad=new Contacts("prasad","551-225-9963");
        Contacts chiranth=new Contacts("chiranth","551-225-9962");
        Contacts ajinkya=new Contacts("ajinkya","551-225-9960");
        sanjan.addNewContact(sanjan1);
        sanjan.addNewContact(prasad);
        sanjan.addNewContact(chiranth);
        sanjan.addNewContact(ajinkya);
        sanjan.getContact();
        System.out.println(sanjan.find(chiranth));
        Contacts harihar=new Contacts("harihar","2912");
        System.out.println(sanjan.updateContact(sanjan1,harihar));
        System.out.println(sanjan.removeContact(chiranth));
        sanjan.getContact();
        System.out.println(sanjan.find(sanjan1));
        Contacts anupama=Contacts.newContact("anupama","100");
        sanjan.addNewContact(anupama);

        //flag,printmenu(0-off,1-print,2-add,3-update,4-remove
        // 5-search,6-printmenu),while,

        boolean flag=true;
        printmenu();
        while(flag){
            System.out.println("Enter choice");
            int choice=input.nextInt();
            input.nextLine();
            switch(choice){
                case 0:
                    flag=false;
                    break;
                case 1:


            }



        }



    }
    public static void printmenu(){
        System.out.println("(0-off,1-print,2-add,3-update,4-remove\n" +
                "        // 5-search,6-printmenu)");

    }
}
