package com.sanjan.algorithms;

/**
 * Created by sanja on 2/2/2017.
 */

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}


public class HackerRank {


    public static Node insert(Node head, int data) {


        if (head == null) {
            head = new Node(data);
            return head;
        }
        Node currentItem=head;

        while(currentItem!=null){

            if(currentItem.next==null){
                currentItem.next=new Node(data);
                return head;
            }else{

                currentItem=currentItem.next;

            }
        }return null;
    }

    public static void display(Node head) {


        while(head!=null){


            System.out.print(head.data+" ");
            head=head.next;
        }


    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

}


