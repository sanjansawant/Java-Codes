package com.sanjan.algorithms;

/**
 * Created by sanja on 1/28/2017.
 */
public class MYlinkedList {

    protected ListItem root = null;


    public MYlinkedList(ListItem root) {
        this.root = root;
    }


    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {

            int comparison = currentItem.compareTo(item);
            if (comparison > 0) {
                if (currentItem.getPrevious() != null) {
                    item.setPrevious(currentItem.getPrevious());
                    currentItem.getPrevious().setNext(item);
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                } else {
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                    root = item;
                }
                return true;
            } else if (comparison < 0) {
                if (currentItem.getNext() != null) {
                    currentItem = currentItem.getNext();

                } else {

                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }

            } else {

                System.out.println(item.getObj() + " is already in the list");
                return false;
            }
        }
        return false;

    }


    public boolean removeItem(ListItem item) {


        ListItem currentItem = this.root;
        while (currentItem != null) {

            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                if(currentItem.getNext()!=null) {
                    currentItem = currentItem.getNext();
                }
            } else if (comparison > 0) {
                //currentItem = currentItem.getPrevious();
                return false;
            } else {

                if(currentItem==this.root){
                    currentItem=currentItem.getNext();
                    this.root=currentItem;
                }else{
                    currentItem.getPrevious().setNext(currentItem.getNext());
                    if(currentItem.getNext()!=null){
                        currentItem.getNext().setPrevious(currentItem.getPrevious());
                    }
                }
                return true;
            }
        }
        return false;


    }


    @Override
    public String toString() {
        return "MYlinkedList{" +
                "root=" + root.getObj() +
                '}';
    }

    public ListItem getRoot() {
        return root;
    }

    public void setRoot(ListItem root) {
        this.root = root;
    }

    public void traverse(ListItem root) {
        while (root != null) {

            System.out.println(root.getObj());
            root = root.getNext();
        }


    }



}
