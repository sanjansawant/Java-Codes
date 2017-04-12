package com.sanjan.algorithms;

/**
 * Created by sanja on 1/13/2017.
 */
public interface NodeList {


    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);

}
