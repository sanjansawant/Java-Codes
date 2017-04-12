package com.company;

public class Main {

    public static void main(String[] args) {

       /* MyLinkedList linked=new MyLinkedList(new ListItem("abc"));
        String name="sanjan";
        String[] nme=name.split("");
        for(int i=0;i<nme.length;i++){
            linked.addItem(new ListItem(nme[i]));

        }
        linked.traverse(linked.getRoot());*/

        Integer inte=new Integer(5);
        int number=inte.intValue();
        Integer num=new Integer(Integer.valueOf(number));
        System.out.println(number);
        double s=3.44445;

        String q="A"+String.format("%02d",3);
        System.out.println(q);

        System.out.println(String.format("%.2f",s));

    }
}
