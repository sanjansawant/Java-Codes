package com.sanjan.algorithms;

/**
 * Created by sanja on 1/16/2017.
 */
public class LinkedListIterator {

    private ListItem listIteratorNext;
    private ListItem listIteratorLast;
    private boolean goingForward;

    private MyLinkedList linkedList;

    public LinkedListIterator(MyLinkedList linkedList) {
        this.linkedList = linkedList;
        listIteratorNext = linkedList.getRoot();
        listIteratorLast=listIteratorNext;
        while(listIteratorLast!=null){
            if(listIteratorLast.getNext()!=null){

                listIteratorLast=listIteratorLast.getNext();
            }else{

                break;
            }

        }

        System.out.println(listIteratorNext.toString());
        System.out.println(listIteratorLast.toString());
    }

    public boolean hasNext() {


        if (listIteratorNext!=null){
            return true;
        }

        return false;
    }

    public boolean hasPrevious(){

        if(listIteratorLast!=null){
            return true;
        }return false;
    }

    public ListItem next(){
        goingForward=true;
        if(hasNext()){
            ListItem currentItem=listIteratorNext;
            listIteratorNext=listIteratorNext.getNext();
            return currentItem;

        }
        listIteratorNext=linkedList.getRoot();
        return listIteratorNext;
    }

    public ListItem previous(){
        goingForward=false;
        if(hasPrevious()){
            ListItem currentItem=listIteratorLast;
            listIteratorLast=listIteratorLast.getPrevious();
            return currentItem;

        }

        return null;
    }

    public void remove(){



            if(listIteratorNext.getPrevious()==null){
                linkedList.root=linkedList.root.getNext();
                listIteratorNext = linkedList.getRoot();

            }else{
                listIteratorNext.getPrevious().setNext(listIteratorNext.getNext());

                if(listIteratorNext.getNext()==null){
                    listIteratorNext=linkedList.getRoot();
                    listIteratorNext.setPrevious(null);

                    //listIteratorLast=listIteratorNext;
                }else{
                    System.out.println("here");
                    listIteratorNext.getNext().setPrevious(listIteratorNext.getPrevious());
                    listIteratorNext = listIteratorNext.getNext();
                }
            }


        }


}


