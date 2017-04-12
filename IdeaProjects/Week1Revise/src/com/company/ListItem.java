package com.company;

/**
 * Created by sanja on 4/7/2017.
 */
public class ListItem {

    private ListItem next=null;
    private ListItem previous=null;

    private Object object;

    public ListItem(Object object) {
        this.object = object;
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

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int compareTo(ListItem item){

        String object1=(String)object;
        String object2=(String)item.getObject();
        return object1.compareTo(object2);
    }

}
