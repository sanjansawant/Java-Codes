package com.sanjan;

/**
 * Created by sanja on 1/12/2017.
 */
public class SearchTree implements NodeList {

    private ListItem root=null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root==null){
            this.root=item;
            return true;
        }

        ListItem currentItem=this.root;
        while(currentItem!=null){

            int comparison=currentItem.compareTo(item);
            if(comparison<0){
                if(currentItem.getNext()!=null){
                    currentItem=currentItem.getNext();
                }else{
                    currentItem.setNext(item);
                    return true;
                }
            }else if(comparison>0){

                if(currentItem.getPrevious()!=null){
                    currentItem=currentItem.getPrevious();
                }else{
                    currentItem.setPrevious(item);
                    return true;
                }
            }else{
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }
        }return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("Deleting item "+item.getValue());
        }
        ListItem currentItem=this.root;
        ListItem parentItem=currentItem;

        while(currentItem!=null){

            int comparison=currentItem.compareTo(item);
            if(comparison<0){
                parentItem=currentItem;
                currentItem=currentItem.getNext();

            }else if(comparison>0){
                parentItem=currentItem;
                currentItem=currentItem.getPrevious();
            }else{
                performRemoval(currentItem,parentItem);
                return true;
            }
        }
        return false;
    }

    public int maxDepth(ListItem root){

        System.out.println("/ "+this.root.getValue());
        if(root==null){
            return 0;
        }else{
            int ldepth=maxDepth(root.getPrevious());
            System.out.println("* "+ldepth);
            int rdepth=maxDepth(root.getNext());
            System.out.println("$ "+rdepth);
            if(ldepth>rdepth){

                return (ldepth+1);
            }else{
                return (rdepth+1);
            }
        }
    }


    public int minimumDepth(ListItem root)
    {
        // Corner case. Should never be hit unless the code is
        // called on root = NULL
        if (root == null)
            return 0;

        // Base case : Leaf Node. This accounts for height = 1.
        if (root.getPrevious() == null && root.getNext() == null)
            return 1;

        // If left subtree is NULL, recur for right subtree
        if (root.getPrevious() == null)
            return minimumDepth(root.getNext()) + 1;

        // If right subtree is NULL, recur for right subtree
        if (root.getNext() == null)
            return minimumDepth(root.getPrevious()) + 1;

        return Math.min(minimumDepth(root.getPrevious()),
                minimumDepth(root.getNext())) + 1;
    }






    public void performRemoval(ListItem item,ListItem parent){

        if(item.next==null){
            if(parent.getNext()==item){

                parent.setNext(item.getPrevious());
            }else if (parent.getPrevious()==item){

                parent.setPrevious(item.getPrevious());
            }else{

                this.root=item.getPrevious();
            }
        }else if(item.previous==null){
            if(parent.getNext()==item){

                parent.setNext(item.getNext());
            }else if (parent.getPrevious()==item){

                parent.setPrevious(item.getNext());
            }else{

                this.root=item.getNext();
            }
        }else{

            ListItem current=item.getNext();
            ListItem leftMostParent=item;

            while(current.getPrevious()!=null){
                leftMostParent=current;
                current=current.getPrevious();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());

            // and delete the smallest
            if (leftMostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.getNext());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftMostParent.setPrevious(current.getNext());
            }


        }


    }

    @Override
    public void traverse(ListItem root) {

        if(root!=null){

            traverse(root.getPrevious());
            System.out.println(root.getValue());
            traverse(root.getNext());
        }
    }
}
