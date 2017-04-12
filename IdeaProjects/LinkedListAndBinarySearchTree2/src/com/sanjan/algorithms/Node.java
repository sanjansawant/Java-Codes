package com.sanjan.algorithms;

/**
 * Created by sanja on 1/14/2017.
 */
public class Node extends ListItem {


    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem getNext() {
        return this.next;
    }

    @Override
    public void setNext(ListItem next) {
        this.next=next;
    }

    @Override
    public ListItem getPrevious() {
        return this.previous;
    }

    @Override
    public void setPrevious(ListItem previous) {
        this.previous=previous;
    }

    @Override
    public int compareTo(ListItem item) {
        return (((String)(this.value)).compareTo((String)item.getValue()));
    }
}
