package com.sanjan.algorithms;

/**
 * Created by sanja on 1/16/2017.
 */
public class ListItem {
    protected ListItem next;

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
}
