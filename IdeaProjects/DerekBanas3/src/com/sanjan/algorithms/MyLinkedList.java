package com.sanjan.algorithms;

/**
 * Created by sanja on 1/13/2017.
 */
public class MyLinkedList {

    public ListItem root=null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public boolean isEmpty(){

        if(this.root==null){
            return true;
        }else{
            return false;
        }
    }

    public void insertFirstLink(String bookName, int millionsSold){

        ListItem newLink=new ListItem(bookName,millionsSold);
        newLink.next=this.root;
        this.root=newLink;
        System.out.println(bookName+" added");

    }

    public ListItem removeFirstLink(){
        ListItem reference=this.root;
        if(!isEmpty()) {
            this.root = root.getNext();
        }else{
            System.out.println("list is empty");

        }
        return this.root;

    }

    public void traverse(ListItem root){

        if(!isEmpty()){
            while(root!=null){

                System.out.println(root.toString());
                root=root.getNext();
            }
        }else{
            System.out.println("list is empty");
        }


    }

    public ListItem findItem(String bookName){


        ListItem theLink=this.root;

        while(theLink.getBookName()!=bookName){

            if(theLink.getNext()==null){
                return null;
            }else{

                theLink=theLink.getNext();
            }
        }return theLink;


    }

    public ListItem removeItem(String bookName){

        ListItem currentLink=this.root;
        ListItem previousLink=this.root;


        while(currentLink.bookName!=bookName){

            if(currentLink.getNext()==null){

                return null;

            }else{
                previousLink=currentLink;
                currentLink=currentLink.getNext();
            }
        }
        if(currentLink==this.root){

            this.root=this.root.getNext();
        }else{

            previousLink.setNext(currentLink.getNext());

        }
        return currentLink;



    }

    public ListItem getRoot() {
        return root;
    }
}
