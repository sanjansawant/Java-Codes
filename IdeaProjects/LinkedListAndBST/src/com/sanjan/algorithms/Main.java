package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {

        String numbers="sanjan niranjan anupama harihar mahabaleshwar";

        String[] array=numbers.split(" ");

        MYlinkedList mYlinkedList=new MYlinkedList(null);

        for(int i=0;i<array.length;i++) {

            mYlinkedList.addItem(new ListItem(array[i]));
        }

        mYlinkedList.traverse(mYlinkedList.getRoot());
        System.out.println("===========");

        MyListIterator listIterator=new MyListIterator(mYlinkedList);

        listIterator.remove();
        listIterator.next();
        listIterator.remove();
        listIterator.next();
        listIterator.next();
       // listIterator.next();
        listIterator=new MyListIterator(mYlinkedList);
        System.out.println("==============");
        while (listIterator.hasNext()){
            listIterator.next();
        }

    }
}
