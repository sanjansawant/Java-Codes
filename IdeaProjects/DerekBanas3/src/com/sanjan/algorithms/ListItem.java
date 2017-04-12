package com.sanjan.algorithms;

/**
 * Created by sanja on 1/13/2017.
 */
public class ListItem {

    public ListItem next=null;
    public String bookName;
    private int millionsSold;

    public ListItem(String bookName, int millionsSold) {
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }




    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getMillionsSold() {
        return millionsSold;
    }

    public void setMillionsSold(int millionsSold) {
        this.millionsSold = millionsSold;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "bookName='" + bookName + '\'' +
                ", millionsSold=" + millionsSold +
                '}';
    }
}
