package com.sanjan.algorithms;

/**
 * Created by sanja on 1/28/2017.
 */
public class MyListIterator {

    private ListItem nextIterator=null;
    private ListItem previousIterator=null;
    private MYlinkedList linkedList;

    public MyListIterator(MYlinkedList linkedList) {
        this.linkedList = linkedList;
        this.nextIterator=linkedList.getRoot();
        this.previousIterator=nextIterator;
    }


   public boolean hasNext(){
        if(previousIterator.getNext()!=null){
            return true;
        }else{
            return false;
        }

   }


   public void next(){

        if(hasNext()){
            System.out.println(nextIterator.getObj());
            previousIterator=nextIterator;
            nextIterator=nextIterator.getNext();
        }

   }

   public void remove(){

        if(linkedList.removeItem(nextIterator)){
            previousIterator=nextIterator;
            nextIterator=nextIterator.getNext();

        }


   }



}
