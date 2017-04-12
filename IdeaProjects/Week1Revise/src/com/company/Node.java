package com.company;

/**
 * Created by sanja on 4/7/2017.
 */
public interface Node {


    public boolean addItem(ListItem item);
    public boolean removeItem(ListItem item);
    void traverse(ListItem root);

}
