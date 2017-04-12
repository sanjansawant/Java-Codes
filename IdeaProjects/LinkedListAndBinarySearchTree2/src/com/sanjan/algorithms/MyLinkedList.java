package com.sanjan.algorithms;

/**
 * Created by sanja on 1/14/2017.
 */
public class MyLinkedList implements NodeList {

    private ListItem root=null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root==null){

            this.root=item;
            return true;
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
            }else{

                System.out.println("item already present "+item.getValue());
                return false;
            }

        }return true;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("removine "+item.getValue()+" from the list");
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

    @Override
    public void traverse(ListItem root) {

        if(this.root==null){
            System.out.println("list is empty");
        }else{

            while(root!=null){

                System.out.println(root.getValue());
                root=root.getNext();

            }
        }
    }
}
