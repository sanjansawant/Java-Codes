package com.sanjan.algorithms;

/**
 * Created by sanja on 1/16/2017.
 */
public class MyLinkedList {

    protected ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    public void insertInFirstPosition(String homeOwnerName, int houseNumber) {
        ListItem currentItem = this.root;
        ListItem newList = new ListItem(homeOwnerName, houseNumber);
        if (currentItem == null) {
            this.root = newList;
        } else {

            newList.setNext(currentItem);
            currentItem.setPrevious(newList);
            this.root = newList;
        }


    }

    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("removine "+item.toString()+" from the list");
        }
        ListItem currentItem=this.root;
        while(currentItem!=null){
            int comparison=currentItem.compareTo(item.homeNumber);
            if(comparison>0){
                //moved ahead;
                return false;
            }else if(comparison<0){

                if(currentItem.getNext()!=null){
                    currentItem=currentItem.getNext();
                }
            }else{

                currentItem.getPrevious().setNext(currentItem.getNext());
                currentItem.getNext().setPrevious(currentItem.getPrevious());
                return true;
            }



        }return false;

    }

    public void insertInLastPosition(String homeOwnerName, int houseNumber) {

        ListItem newList = new ListItem(homeOwnerName, houseNumber);

        ListItem currentItem = this.root;
        while (currentItem.getNext() != null) {
            currentItem = currentItem.getNext();
        }

        currentItem.setNext(newList);
        newList.setPrevious(currentItem);


    }

    public boolean insertAfterKey(String homeOwnerName, int houseNumber, int key) {

        ListItem newList = new ListItem(homeOwnerName, houseNumber);

        ListItem currentItem = this.root;
        while (currentItem != null) {

            if (currentItem.homeNumber == key) {

                if (currentItem.getNext() == null) {
                    currentItem.setNext(newList);
                    newList.setPrevious(currentItem);

                } else {

                    newList.setNext(currentItem.getNext());
                    currentItem.getNext().setPrevious(newList);
                    currentItem.setNext(newList);
                    newList.setPrevious(currentItem);
                }
                return true;

            } else {
                currentItem = currentItem.getNext();
            }
        }
        return false;
    }


    public boolean insertInOrder(String homeOwnerName, int houseNumber) {
        ListItem newList = new ListItem(homeOwnerName, houseNumber);
        if (this.root == null) {
            this.root = newList;

        }else {
            ListItem currentItem = this.root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(houseNumber);
                if (comparison < 0) {
                    if (currentItem.getNext() != null) {
                        currentItem = currentItem.getNext();
                    } else {

                        currentItem.setNext(newList);
                        newList.setPrevious(currentItem);
                        return true;
                    }
                } else if (comparison > 0) {

                    if (currentItem.getPrevious() != null) {
                        currentItem.getPrevious().setNext(newList);
                        newList.setPrevious(currentItem.getPrevious());
                        newList.setNext(currentItem);
                        currentItem.setPrevious(newList);


                    } else {
                        newList.setNext(currentItem);
                        currentItem.setPrevious(newList);
                        this.root = newList;

                    }
                    return true;
                } else {

                    System.out.println("house with same number not allowed");
                    return false;
                }

            }
        }return false;


    }


    public void traverse(ListItem root) {
        while (root != null) {

            System.out.println(root.toString());
            root = root.getNext();
        }
    }

}
