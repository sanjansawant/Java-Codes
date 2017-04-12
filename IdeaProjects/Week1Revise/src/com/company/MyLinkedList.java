/*
package com.company;

*/
/**
 * Created by sanja on 4/7/2017.
 *//*

public class MyLinkedList implements Node {

    private ListItem root=null;

    public MyLinkedList(ListItem root) {
        this.root = root;
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
                     currentItem.getPrevious().setNext(item);
                     item.setPrevious(currentItem.getPrevious());
                     item.setNext(currentItem);
                     currentItem.setPrevious(item);

                 }else{
                     currentItem.setPrevious(item);
                     item.setNext(currentItem);
                     this.root=item;

                 }return true;

             } else{
                System.out.println("Same item not added");
                return false;
            }


        }return true;

    }

    @Override
    public boolean removeItem(ListItem item) {

        if(this.root!=null){
            System.out.println("removing "+item.getObject());
        }
        ListItem currentItem=this.root;
        while(currentItem!=null){
            int comparison=currentItem.compareTo(item);
            if(comparison<0){
                if(currentItem.getNext()!=null){
                    currentItem=currentItem.getNext();
                }else{
                    System.out.println("Reached end item not found");
                    return false;
                }

            }else if(comparison>0){
                if(currentItem.getPrevious()!=null){
                    currentItem=currentItem.getPrevious();
                }else{
                    System.out.println("Reached begining and item not found");
                    return false;
                }

            }else{

                if(currentItem==this.root){
                 //   if()
                    this.root=currentItem.getNext();
                    return true;
                }


            }


        }

    }

    @Override
    public void traverse(ListItem root) {

        while(root!=null) {
            System.out.println(root.getObject());
            root = root.getNext();
        }
    }

    public ListItem getRoot(){
        return this.root;
    }
}
*/
