package com.sanjan.algorithms;

/**
 * Created by sanja on 1/16/2017.
 */
public class MyLinkedList {
    private ListItem root=null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    public boolean insertFirstLink(String home, int Number){
        ListItem newList=new ListItem(home,Number);
        if(this.root==null){
            this.root=newList;

        }else{
            newList.next=this.root;
            this.root=newList;


        }
        return true;

    }

    public boolean removeFirstLink(){

        if(this.root==null){

            System.out.println("List is empty");
            return false;
        }

        this.root=this.root.getNext();
        return true;
    }


    public void traverse(ListItem root){

        if(this.root==null){
            System.out.println("list is empty");
        }else{

            while(root!=null){

                System.out.println(root.toString());
                root=root.getNext();
            }


        }

    }

    public ListItem findLink(String home){

        ListItem currentItem=this.root;
        while(currentItem.homeOwnerName!=home){
            if(currentItem.getNext()==null){
                return null;
            }else{

                currentItem=currentItem.getNext();
            }
        }

        return currentItem;
    }



    public boolean removeSpecific(String home){
        if(this.root!=null){

            System.out.println("Deleting "+home);
        }
        ListItem currentItem=this.root;
        ListItem parent=currentItem;

        while(currentItem.homeOwnerName!=home){
            if(currentItem.getNext()==null){
                System.out.println("didnt find "+home);
                return false;
            }else{

                parent=currentItem;
                currentItem=currentItem.getNext();
            }
        }

        if(currentItem==this.root){

            this.root=currentItem.getNext();
            return true;
        }else{
            parent.setNext(currentItem.getNext());
            return true;
        }




    }




    public ListItem getRoot() {
        return root;
    }
}
