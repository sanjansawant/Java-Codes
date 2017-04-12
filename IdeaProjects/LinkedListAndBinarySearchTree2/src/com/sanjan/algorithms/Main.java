package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree newList=new BinarySearchTree(null);
        newList.addItem(new Node("sanjan"));
        newList.addItem(new Node("anupama"));
        newList.addItem(new Node("harihar"));
        newList.addItem(new Node("niranjan"));
        newList.traverse(newList.getRoot());
        System.out.println("===============");

        newList.traverse(newList.getRoot());
        System.out.println("===============");

        newList.reverseTraverse(newList.getRoot());
    }
}
