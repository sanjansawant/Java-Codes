package com.sanjan;

/**
 * Created by sanja on 1/12/2017.
 */
public abstract class ListItem {

    protected ListItem next=null; //crated instances of the same class within a class
    protected ListItem previous=null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract ListItem setNext(ListItem next);
    public abstract ListItem setPrevious(ListItem previous);
    public abstract ListItem getNext();
    public abstract ListItem getPrevious();

    public abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;

    }

}
