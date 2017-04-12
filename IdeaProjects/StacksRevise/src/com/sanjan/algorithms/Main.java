package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {

       /* Stacks theStacks=new Stacks(10);
        theStacks.pop();
        theStacks.peep();
        theStacks.push("12");
        theStacks.push("13");
        theStacks.pushMany("1,2,3,4,5,6,7,8");
        System.out.println("==========");
        theStacks.pop();
        System.out.println("============");
        theStacks.popMany();
        theStacks.displayArray();*/

       Queue theQueue=new Queue(10);
       theQueue.priorityQueue("50");
        theQueue.priorityQueue("15");
        theQueue.priorityQueue("20");
        theQueue.priorityQueue("25");
        //theQueue.displayArray();
        //theQueue.pop();
        theQueue.displayArray();
        //theQueue.pop();
        //theQueue.displayArray();
    }
}
