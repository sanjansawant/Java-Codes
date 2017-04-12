package com.sanjan.algorithms;

/**
 * Created by sanja on 1/28/2017.
 */
public class ListItem {

    protected ListItem next;
    protected ListItem previous;
    private Object obj;

    public ListItem(Object obj){
        this.obj=obj;
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

    public int compareTo(ListItem item){
        String name=item.getObj();
        return(((String)this.obj).compareTo(name));

    }

    public String getObj() {
        return (String)obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
