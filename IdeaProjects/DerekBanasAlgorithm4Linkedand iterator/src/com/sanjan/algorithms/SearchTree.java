package com.sanjan.algorithms;

/**
 * Created by sanja on 1/16/2017.
 */
public class SearchTree {

    private ListItem root=null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return this.root;
    }

    public boolean addItem(ListItem item){

        if(this.root==null){
            this.root=item;
            return true;
        }
        ListItem currentItem=this.root;
        while(currentItem!=null){
            int comparison=currentItem.compareTo(item.homeNumber);
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

                System.out.println("already present");
                return false;
            }
        }return false;


    }


    public boolean removeItem(ListItem item){

        ListItem currentItem=this.root;
        ListItem parentItem=currentItem;
        while(currentItem!=null){
            int comparsion=currentItem.compareTo(item.homeNumber);
            if(comparsion<0){

                if(currentItem.getNext()==null){
                    return false;
                }else{
                    parentItem=currentItem;
                    currentItem=currentItem.getNext();
                }

            }else if(comparsion>0){

                if(currentItem.getPrevious()==null){

                    return false;
                }else{
                    parentItem=currentItem;
                    currentItem=currentItem.getPrevious();
                }


            }else{

                parentRemoval(currentItem,parentItem);
                return true;
            }


        }return false;

    }


    public void parentRemoval(ListItem item,ListItem parent){

        if(item.getNext()==null){
            if(parent.getNext()==item){
                parent.setNext(item.getPrevious());

            }else if(parent.getPrevious()==item){
                parent.setPrevious(item.getPrevious());
            }else{
                // parent must be item, which means we were looking at the root of the tree
                this.root=item.getPrevious();
            }
        }else if(item.getPrevious()==null){

            if(parent.getNext()==item){
                parent.setNext(item.getNext());

            }else if(parent.getPrevious()==item){
                parent.setPrevious(item.getNext());
            }else{
                this.root=item.getNext();
            }
        }else{

            ListItem leftMostParent=item;
            ListItem current=item.getNext();

            while(current.getPrevious()!=null){
                leftMostParent=item;
                current=current.getPrevious();
            }

            item.homeNumber=current.homeNumber;

            if(leftMostParent==item){
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.getNext());

            }else{

                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftMostParent.setPrevious(current.getNext());
            }



        }



    }

    public void traverse(ListItem root){

        if(root!=null){
            traverse(root.getPrevious());
            System.out.println(root.toString());
            traverse(root.getNext());

        }
    }
}
