package com.sanjan.algorithms;

/**
 * Created by sanja on 1/14/2017.
 */
public class MyListIterator {

    private ListItem currentItem;

    private MyLinkedList myLinkedList;

    public MyListIterator(MyLinkedList mylinkedlist){
        this.myLinkedList=mylinkedlist;
        this.currentItem=mylinkedlist.getRoot();

    }


    public boolean hasNext(){



        if(currentItem.getNext()!=null){
            return true;
        }else{
            next();
            return false;
        }

    }

    public ListItem next(){



        if(currentItem.getNext()==null){
            System.out.println(currentItem.toString());
            return currentItem;
        }else {
            ListItem parent=currentItem;
            currentItem=currentItem.getNext();
            return parent;
        }
    }


    public void remove(){



        if(currentItem.getPrevious()==null){
            myLinkedList.root=myLinkedList.getRoot().getNext();

        }



    }
}
