package com.sanjan;



/**
 * Created by sanja on 1/12/2017.
 */
public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem setNext(ListItem next1) {
        this.next=next1;
        return this.next;
    }

    @Override
    public ListItem setPrevious(ListItem previous1) {
        this.previous=previous1;
        return this.previous;

    }

    @Override
    public ListItem getNext() {
        return this.next;
    }

    @Override
    public ListItem getPrevious() {
        return this.previous;

    }

    @Override
    public int compareTo(ListItem item) {
        if(item!=null){

            return(((String)super.getValue()).compareTo(((String)item.getValue())));
        }else{
            return -1;
        }
    }
}
