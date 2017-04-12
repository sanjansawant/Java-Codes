package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list=new MyLinkedList(new ListItem("sanjan",12));
        list.insertFirstLink("anupama",13);
        list.insertFirstLink("harihar",14);
        list.insertFirstLink("niranjan",15);
        list.insertFirstLink("supriya",15);
        list.traverse(list.getRoot());
        System.out.println("============");
        System.out.println(list.removeSpecific("harihar"));
        list.traverse(list.getRoot());
        /*list.removeFirstLink();
        list.traverse(list.getRoot());


        System.out.println("============");
        list.removeFirstLink();
        list.removeFirstLink();
        list.traverse(list.getRoot());
        System.out.println("============");
        System.out.println(list.findLink("harihar"));
        */


    }
}
