package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {
        MyLinkedList newList=new MyLinkedList(null);
        newList.insertInOrder("sanjan",12);
        newList.insertInOrder("niranjan",13);
        newList.insertInOrder("harihar",15);
        newList.insertInOrder("anupama",11);
        newList.traverse(newList.getRoot());
        System.out.println("===================");
        newList.insertAfterKey("anurag",14,13);
        newList.traverse(newList.getRoot());
        /*System.out.println("========");
        newList.addLastLink("harihar1",14);
        newList.traverse(newList.getRoot());
        System.out.println("========");
        newList.addFirstLink("niranjan1",16);
        newList.traverse(newList.getRoot());
        System.out.println("========");
        newList.insertAfterKey("anurag",20,14);
        newList.traverse(newList.getRoot());
        System.out.println("========");
        newList.insertInOrder(new ListItem("mahabaleshwar",12));
        newList.traverse(newList.getRoot());
*/
        System.out.println("===================\n");
        MyListIterator listIterator=new MyListIterator(newList);

        while(listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
        listIterator.remove();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
    }
}
