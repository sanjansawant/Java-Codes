package com.sanjan.algorithms;

/**
 * Created by sanja on 1/16/2017.
 */
public class ListItem {

    protected ListItem next=null;
    protected ListItem previous=null;

    public String homeOwnerName;
    public int homeNumber;

    public ListItem(String homeOwnerName, int homeNumber) {
        this.homeOwnerName = homeOwnerName;
        this.homeNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "homeOwnerName='" + homeOwnerName + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
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

    public int compareTo(int number){

        if(this.homeNumber>number){

            return 1;
        }else if(this.homeNumber<number){
            return -1;
        }else{
            return 0;
        }
    }

}
