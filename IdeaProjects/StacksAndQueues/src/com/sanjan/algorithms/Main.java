package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {
        Stacks stacks=new Stacks(10);
        stacks.push("10");
        stacks.push("15");
        stacks.push("20");
        stacks.push("25");
        stacks.display();
        stacks.peek();
        stacks.pop();
        stacks.display();
        stacks.push("10");
        stacks.push("20");
        stacks.push("30");
        stacks.push("40");
        stacks.push("50");
        stacks.push("60");
        stacks.push("70");
        stacks.display();
        System.out.println("===========");
        stacks.popMany();
        stacks.display();

        System.out.println("=======================================");
        Queue theQueue=new Queue(10);
        theQueue.display();
        theQueue.priorityInsert("1011");
        theQueue.priorityInsert("120");
        theQueue.priorityInsert("130");
        theQueue.priorityInsert("40");
        theQueue.priorityInsert("150");
        theQueue.priorityInsert("610");
        theQueue.priorityInsert("701");
        theQueue.priorityInsert("80");
        theQueue.priorityInsert("190");
        theQueue.priorityInsert("1010");
        //theQueue.priorityInsert("110");
        theQueue.peek();
        theQueue.display();
        theQueue.remove();
        theQueue.display();
    }
}
