package com.sanjan;

/**
 * Created by sanja on 1/12/2017.
 */
public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
