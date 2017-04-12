package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list=new MyLinkedList(null);
        list.insertFirstLink("saturday",4);
        list.insertFirstLink("sunday",5);
        list.insertFirstLink("monday",3);
        list.insertFirstLink("tuesday",2);
        list.isEmpty();
        System.out.println("==>"+list.findItem("saturday"));
        list.traverse(list.getRoot());
        System.out.println(list.removeItem("sunday"));
        System.out.println("=========");
        list.traverse(list.getRoot());
    }
}
