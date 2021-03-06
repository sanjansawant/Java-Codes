package com.sanjan;

/**
 * Created by sanja on 1/12/2017.
 */
public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.getNext() != null) {
                    currentItem = currentItem.getNext();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.getPrevious() != null) {
                    currentItem.getPrevious().setNext(newItem).setPrevious(currentItem.getPrevious());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (this.root == null) {
            // The list was empty, so this item becomes the head of the list
            System.out.println("nothing in the list");
            return false;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                currentItem = currentItem.getNext();
            } else if (comparison > 0) {
                //we have already moved forward
                return false;
            } else {
                if (currentItem == this.root) {
                    this.root = currentItem.getNext();
                }else {
                    currentItem.getPrevious().setNext(currentItem.getNext());
                    if (currentItem.getNext() != null) {
                        currentItem.getNext().setPrevious(currentItem.getPrevious());
                    }
                    System.out.println(currentItem.getValue() + " is removed");
                }return true;

            }
        }
        return false;
    }


    @Override
    public void traverse(ListItem root) {
        if (this.root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.getNext();
            }
        }

    }
}
