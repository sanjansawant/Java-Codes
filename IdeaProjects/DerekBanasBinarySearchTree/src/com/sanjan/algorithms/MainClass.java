package com.sanjan.algorithms;

/**
 * Created by sanja on 1/22/2017.
 */
public class MainClass {

    public static void main(String[] args) {
        BinarySearchTree theTree=new BinarySearchTree(null);
        theTree.addNode(50,"Boss");
        theTree.addNode(25,"VP");
        theTree.addNode(15,"om");
        theTree.addNode(30,"secx");
        theTree.addNode(75,"SM");
        theTree.addNode(85,"SM1");
        theTree.traverse(theTree.getRoot());

        System.out.println("=======================");
        theTree.preOrderTraverse(theTree.getRoot());


        System.out.println("=======================");
        theTree.postOrderTraverse(theTree.getRoot());


        System.out.println("=======================");
        theTree.findNode(30);

        System.out.println("=======================");
        theTree.deleteNode(25);
        theTree.traverse(theTree.getRoot());


        int name=5;
        String name1=Integer.toString(name);
        System.out.println(name1);
        
    }
}
