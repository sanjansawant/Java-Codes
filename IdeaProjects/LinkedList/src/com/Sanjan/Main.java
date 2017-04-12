package com.Sanjan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;
public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Customer customer=new Customer("tim",50);
        Customer newCustomer=customer;//pointing to first class,it didnt create new class it saved the memory address of first class

        newCustomer.setName("sanjan");
        newCustomer.setAmount(90);
        System.out.println(customer.getName()+"  "+customer.getAmount());

        System.out.println("a".compareTo("b"));

        LinkedList<String> placesToVisit=new LinkedList<>();
        addAscending(placesToVisit,"hyderabad");
        addAscending(placesToVisit,"mumbai");
        addAscending(placesToVisit,"goa");
        addAscending(placesToVisit,"panji");
        addAscending(placesToVisit,"karnataka");
        addAscending(placesToVisit,"pune");
        addAscending(placesToVisit,"hyderabad");
        addAscending(placesToVisit,"ahmedabad");
        printResult(placesToVisit);
        visit(placesToVisit);


    }

    private static void printResult(LinkedList<String> placesToVisit){

        Iterator<String> iterator=placesToVisit.iterator();

        while(iterator.hasNext()){

            System.out.println("now visiting "+iterator.next());
        }



    }

    private static boolean addAscending(LinkedList<String> placesToVisit,String newItem){

        ListIterator<String> iterator=placesToVisit.listIterator();

        while(iterator.hasNext()){

            int comparison=iterator.next().compareTo(newItem);
            if(comparison==0){

                System.out.println("place is already in the list so skip");
                return false;
            }else if(comparison > 0){

                iterator.previous();
                iterator.add(newItem);
                System.out.println("succcess");
                return true;
            }else{
                //moved forward

            }

        }
        iterator.add(newItem);
        return true;
    }

    private static void visit(LinkedList<String> placesToVisit){

        boolean flag=true;
        boolean goingForward=true;
        ListIterator<String> iterator=placesToVisit.listIterator();

        if(placesToVisit.getFirst().isEmpty()){
            System.out.println("nothing in the list");
        }else {

            printOptions();
            System.out.println("visiting "+iterator.next());
        }
        while(flag){
            System.out.println("Enter your choice");
            int action=input.nextInt();
            switch(action){

                case 0:
                    printOptions();
                    break;
                case 1:
                    System.out.println("vacations over");
                    flag=false;
                    break;
                case 2:
                    if(!goingForward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        goingForward=true;
                    }


                    if(iterator.hasNext()){
                        System.out.println("visiting "+iterator.next());
                    }else{
                        System.out.println("reached end");
                        goingForward=false;
                    }
                    break;
                case 3:
                    if(goingForward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        goingForward=false;
                    }

                    if(iterator.hasPrevious()){
                        System.out.println("visiting "+iterator.previous());
                    }else{
                        System.out.println("reached begining");
                        goingForward=true;
                    }
                    break;
            }
        }
    }

    private static void printOptions(){
        System.out.println("print menu");
    }

}
