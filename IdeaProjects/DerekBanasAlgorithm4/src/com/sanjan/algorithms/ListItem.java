package com.sanjan.algorithms;

/**
 * Created by sanja on 1/14/2017.
 */
public class ListItem {

    protected ListItem next=null;
    protected ListItem previous=null;
    protected String homeOwnerName;
    protected int homeNumber;


    public ListItem(String homeOwnerName, int homeNumber) {
        this.homeOwnerName = homeOwnerName;
        this.homeNumber = homeNumber;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public ListItem getPrevious() {
        return previous;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "homeOwnerName='" + homeOwnerName + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
    }

    public int compareTo(ListItem root){

        if(this.homeNumber<root.homeNumber){
            return -1;
        }else if(this.homeNumber>root.homeNumber){
            return 1;
        }else{
            return 0;
        }



    }


}
