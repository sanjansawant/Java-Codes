package com.sanjan.algorithms;

import java.util.*;
/**
 * Created by sanja on 1/23/2017.
 */
public class Queue {


    private String[] queueArray;
    private int size;
    private int front,rear,numberOfItems=0;//which is going to symbolize later that it is empty


    public Queue(int size) {
        this.size = size;
        this.queueArray=new String[size];
        Arrays.fill(queueArray,"-1");
    }


    public void insert(String input){
        System.out.println(rear);

        if(numberOfItems+1<=size){

            queueArray[rear]=input;
            rear++;

            numberOfItems++;
            System.out.println("INSERT "+input+" was added\n");

        }else{

            System.out.println("Sorry but the queue is full");
        }


    }


    public void remove(){

        if(numberOfItems>0){

            System.out.println("Removed "+queueArray[front]+" was removed");
            queueArray[front]="-1";
            front++;
            numberOfItems--;
        }else{

            System.out.println("sorry the queue array is empty");
        }

    }

    public void peek(){

        System.out.println("The front element is "+queueArray[front]);


    }


    public void displayTheStack(){



        for(int i=0;i<queueArray.length;i++){

            if(queueArray[i].equals("-1")){

                System.out.println(i+"  ");
            }else {

                System.out.println(i + "  " + queueArray[i]);
            }
        }
        System.out.println();


    }
}
