package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {

        MyLinkedList theLinkedList=new MyLinkedList(null);

        theLinkedList.insertInOrder("Mark Evans", 7);
        theLinkedList.insertInOrder("Piers Polkiss", 9);
        theLinkedList.insertInOrder("Doreen Figg", 6);
        theLinkedList.insertInOrder("Petunia Dursley", 4);
        theLinkedList.traverse(theLinkedList.getRoot());
        System.out.println("========");
        /*theLinkedList.insertAfterKey("Derek Banas", 2, 6);
        theLinkedList.traverse(theLinkedList.getRoot());*/

        LinkedListIterator iterator=new LinkedListIterator(theLinkedList);
        System.out.println("========");
        System.out.println(iterator.next().toString());
        System.out.println(iterator.next().toString());
        System.out.println(iterator.next().toString());
        iterator.remove();
        System.out.println("========");
        System.out.println(iterator.next().toString());
        System.out.println(iterator.next().toString());
        System.out.println(iterator.next().toString());
        System.out.println(iterator.next().toString());

    }


    }

