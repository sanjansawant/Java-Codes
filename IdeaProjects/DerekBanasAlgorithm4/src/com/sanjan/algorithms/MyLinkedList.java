package com.sanjan.algorithms;

/**
 * Created by sanja on 1/14/2017.
 */
public class MyLinkedList {
    protected ListItem root = null;
    private ListItem lastLink=null;

    public MyLinkedList(ListItem root) {
        this.root = root;

    }


    public boolean isEmpty() {

        if (this.root == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addFirstLink(String homeOwnerName, int homeNumber) {
        ListItem newList = new ListItem(homeOwnerName, homeNumber);
        if (isEmpty()) {

            lastLink=newList;
            return  true;

        } else {
            newList.setNext(this.root);
            this.root.setPrevious(newList);
            this.root = newList;

            return true;
        }


    }

    public boolean addLastLink(String homeOwnerName, int homeNumber) {
        ListItem lastList = new ListItem(homeOwnerName, homeNumber);
        if (isEmpty()) {
            this.root = lastList;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            if (currentItem.getNext() != null) {
                currentItem = currentItem.getNext();
            } else {

                currentItem.setNext(lastList);
                lastList.setPrevious(currentItem);
                return true;

            }
        }

        return false;
    }


    public boolean insertAfterKey(String homeOwnerName, int homeNumber, int key) {
        ListItem newList = new ListItem(homeOwnerName, homeNumber);

        ListItem currentItem = this.root;
        while (currentItem != null) {
            if (currentItem.homeNumber != key) {

                currentItem = currentItem.getNext();
            } else if (currentItem.homeNumber == key) {
                if (currentItem.getNext() != null) {

                    newList.setPrevious(currentItem);
                    newList.setNext(currentItem.getNext());
                    currentItem.getNext().setPrevious(newList);
                    currentItem.setNext(newList);
                    return true;
                } else {
                    currentItem.setNext(newList);
                    newList.setPrevious(currentItem);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;


    }


    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("removine "+item.homeOwnerName+" from the list");
        }
        ListItem currentItem=this.root;
        while(currentItem!=null){
            int comparison=currentItem.compareTo(item);
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


    public boolean insertInOrder(String homeOwnerName, int homeNumber){

        ListItem item=new ListItem(homeOwnerName,homeNumber);
        if(this.root==null){

            this.root=item;
        }

        ListItem currentItem=this.root;
        while(currentItem!=null){

            int comparison=currentItem.compareTo(item);
            if(comparison<0){
                if(currentItem.getNext()!=null){
                    currentItem=currentItem.getNext();
                }else{

                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            }else if(comparison>0){
                if(currentItem.getPrevious()!=null){
                        item.setPrevious(currentItem.getPrevious());
                        currentItem.getPrevious().setNext(item);
                        item.setNext(currentItem);
                        currentItem.setPrevious(item);


                }else{
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                    this.root=item;

                }
                return true;
            }
            else{

                System.out.println("houseNumber already present");
                return false;
            }

        }return false;

    }




    public void traverse(ListItem root) {

        if (this.root == null) {
            System.out.println("List is empty");
        } else {

            while (root != null) {

                System.out.println(root.toString());
                root = root.getNext();

            }
        }


    }

    public ListItem getRoot() {
        return root;
    }
}
