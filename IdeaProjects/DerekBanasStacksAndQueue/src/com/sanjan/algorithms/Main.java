package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {

       /* Stacks stacks=new Stacks(10);
        stacks.push("10");
        stacks.push("15");
        stacks.peek();
        stacks.pop();
        stacks.displayTheStack();

        stacks.pushMany("4 5 6 7 2 1 4 3 2 4");
        stacks.popAll();
        stacks.displayTheStack();*/

       Queue theQueue=new Queue(10);
       theQueue.insert("10");
       theQueue.insert("15");
       theQueue.insert("20");
        theQueue.insert("20");
        theQueue.insert("20");
        theQueue.insert("20");
        theQueue.insert("20");
        theQueue.insert("20");
        theQueue.insert("20");
        theQueue.insert("13");
        theQueue.insert("13");
       theQueue.displayTheStack();

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();
        theQueue.displayTheStack();
        theQueue.peek();
    }
}
