package com.sanjan.algorithms;



/**
 * Created by sanja on 1/14/2017.
 */
public class BinarySearchTree implements NodeList {

    private ListItem root=null;

    public BinarySearchTree(ListItem root) {
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
                    return true;
                }
            }else if(comparison>0){
                if(currentItem.getPrevious()!=null){
                    currentItem=currentItem.getPrevious();
                }else{

                    currentItem.setPrevious(item);
                    return true;
                }
            }else{

                System.out.println("item already present no duplicated are allowed");
                return false;
            }

        }return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("removing "+item.getValue()+" from the list");
        }
        ListItem currentItem=this.root;
        ListItem parentItem=currentItem;
        while(currentItem!=null){
            int comparison=currentItem.compareTo(item);
            if(comparison<0){
                parentItem=currentItem;
                currentItem=currentItem.getNext();

            }else if(comparison>0){

                parentItem=currentItem;
                currentItem=currentItem.getPrevious();
            }else{

                parentRemoval(currentItem,parentItem);
                return true;
            }
        }return false;


    }



    public void parentRemoval(ListItem item,ListItem parent){

        if(item.getPrevious()==null){
            if(parent.getNext()==item){
                parent.setNext(item.getNext());
            }else if(parent.getPrevious()==item){
                parent.setPrevious(item.getNext());
            }else{

                this.root=item.getNext();
            }
        }else if(item.getNext()==null){

            if(parent.getNext()==item){
                parent.setNext(item.getPrevious());
            }else if(parent.getPrevious()==item){
                parent.setPrevious(item.getPrevious());
            }else{

                this.root=item.getPrevious();
            }
        }else{

            ListItem leftMostParent=item;
            ListItem current=item.getNext();

            while(current.getPrevious()!=null){

                leftMostParent=current;
                current=current.getPrevious();
            }

            item.setValue(current.getValue());


            if(leftMostParent==item){

                item.setNext(current.getNext());
            }else{

                item.setPrevious(current.getNext());
            }

        }



    }

    @Override
    public void traverse(ListItem root) {

        if(root!=null){

            traverse(root.getPrevious());
            System.out.println(root.getValue());
            traverse(root.getNext());

        }
    }

    public void reverseTraverse(ListItem root){

        if(root!=null){
            reverseTraverse(root.getNext());
            System.out.println(root.getValue());
            reverseTraverse(root.getPrevious());


        }


    }
}
