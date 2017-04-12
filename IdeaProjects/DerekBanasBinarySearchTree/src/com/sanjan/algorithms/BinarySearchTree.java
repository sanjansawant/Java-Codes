package com.sanjan.algorithms;

/**
 * Created by sanja on 1/22/2017.
 */

class Node {

    private Node leftChild = null;
    private Node rightChild = null;
    private int key;
    private String name;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {

        return (this.key + ", " + this.name);

    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}

public class BinarySearchTree {

    private Node root=null;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public boolean addNode(int key, String name){

        Node node=new Node(key,name);
        if(this.root==null){
            this.root=node;
        }

        Node currentItem=this.root;
        while(currentItem!=null){
            int comparison=currentItem.getKey()-node.getKey();
            if(comparison<0){
                if(currentItem.getRightChild()!=null){
                    currentItem=currentItem.getRightChild();

                }else{
                    currentItem.setRightChild(node);
                    return true;
                }
            }else if(comparison>0){
                if(currentItem.getLeftChild()!=null){

                    currentItem=currentItem.getLeftChild();
                }else{
                    currentItem.setLeftChild(node);
                    return true;

                }
            }else{

                //System.out.println("keys are same so cannot be added");
                return false;
            }


        }return false;

    }

    public void traverse(Node root){

        if(root!=null){
            traverse(root.getLeftChild());
            System.out.println(root.toString());
            traverse(root.getRightChild());
        }

    }


    public void preOrderTraverse(Node root){

        if(root!=null){
            System.out.println(root.toString());
            preOrderTraverse(root.getLeftChild());
            preOrderTraverse(root.getRightChild());
        }

    }


    public void postOrderTraverse(Node root){

        if(root!=null){

            postOrderTraverse(root.getLeftChild());
            postOrderTraverse(root.getRightChild());
            System.out.println(root.toString());
        }

    }

    public Node findNode(int key){
        Node currentItem=this.root;
        Node parentItem=currentItem;
        while(currentItem!=null){
            int comparison=currentItem.getKey()-key;
            if(comparison<0){

                parentItem=currentItem;
                currentItem=currentItem.getRightChild();

            }else if(comparison>0){

                parentItem=currentItem;
                currentItem=currentItem.getLeftChild();

            }else{
                System.out.println(currentItem+" found");
                return currentItem;

            }
        }return null;



    }


    public boolean deleteNode(int key){

        Node currentItem=this.root;
        Node parentItem=currentItem;
        while(currentItem!=null){
            int comparison=currentItem.getKey()-key;
            if(comparison<0){

                parentItem=currentItem;
                currentItem=currentItem.getRightChild();

            }else if(comparison>0){

                parentItem=currentItem;
                currentItem=currentItem.getLeftChild();

            }else{
                System.out.println(currentItem+" found and deleting");
                System.out.println("=========================");
                parentRemoval(currentItem,parentItem);
                return true;
            }
        }return false;


    }


    private void parentRemoval(Node currentItem,Node parentItem){

        if(currentItem.getRightChild()==null){

            if(parentItem.getRightChild()==currentItem){

                parentItem.setRightChild(currentItem.getLeftChild());

            }else if(parentItem.getLeftChild()==currentItem){

                parentItem.setLeftChild(currentItem.getLeftChild());
            }else{


                this.root=currentItem.getLeftChild();
            }
        }else if(currentItem.getLeftChild()==null){

            if(parentItem.getRightChild()==currentItem){

                parentItem.setRightChild(currentItem.getRightChild());

            }else if(parentItem.getLeftChild()==currentItem){

                parentItem.setLeftChild(currentItem.getRightChild());
            }else{
                this.root=currentItem.getRightChild();
            }
        }else{

            Node item=currentItem.getRightChild();
            Node LeftMostParent=item;

            while(item.getLeftChild()!=null){
                LeftMostParent=item;
                item=item.getLeftChild();
            }

            currentItem.setKey(item.getKey());

            if(LeftMostParent==currentItem){

                currentItem.setRightChild(item.getRightChild());

            }else{

                LeftMostParent.setLeftChild(item.getRightChild());


            }


        }


    }


    public Node getRoot() {
        return root;
    }
}
