package com.Sanjan;

import java.util.LinkedList;
import java.util.*;

/**
 * Created by sanja on 1/4/2017.
 */
public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit=new LinkedList<>();

        placesToVisit.add("Mumbai");
        placesToVisit.add("pune");
        placesToVisit.add("ahmedabad");
        placesToVisit.add("goa");
        placesToVisit.add("kARNATAKa");
        placesToVisit.add("kanyakumari");
        placesToVisit.add("shimla");

        printResult(placesToVisit);
    }


    public static void printResult(LinkedList<String> placesToVisit){

        Iterator<String> iterator=placesToVisit.iterator();

        while(iterator.hasNext()){

            System.out.println("now visiting "+iterator.next());
        }

    }
}
