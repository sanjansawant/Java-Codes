package com.sanjan;

public class Main {

    public static void main(String[] args) {

        Node node=new Node("1");

	    SearchTree tree=new SearchTree(node);

	    //tree.traverse(tree.getRoot());


        System.out.println("==> "+tree.maxDepth(tree.getRoot()));
        System.out.println("==> "+tree.minimumDepth(tree.getRoot()));


        tree.traverse(tree.getRoot());
        //tree.traverse(tree.getRoot());

//	    tree.removeItem(new Node("3"));
//        tree.traverse(tree.getRoot());
//        tree.removeItem(new Node("5"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("0"));
//        tree.removeItem(new Node("4"));
//
//        tree.removeItem(new Node("2"));
//        tree.traverse(tree.getRoot());

    }
}
