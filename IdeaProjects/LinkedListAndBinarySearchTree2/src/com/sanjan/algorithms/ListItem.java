package com.sanjan.algorithms;

/**
 * Created by sanja on 1/14/2017.
 */
public abstract class ListItem {

    protected ListItem next=null;
    protected ListItem previous=null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }


    public abstract ListItem getNext();

    public abstract void setNext(ListItem next);
    public  abstract ListItem getPrevious();
    public abstract void setPrevious(ListItem previous);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public abstract int compareTo(ListItem item);
}
