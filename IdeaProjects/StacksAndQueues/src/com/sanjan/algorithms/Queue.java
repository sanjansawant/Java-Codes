package com.sanjan.algorithms;

import java.util.Arrays;

/**
 * Created by sanja on 1/23/2017.
 */
public class Queue {

    private String[] stackArray;
    private int size;
    private int front=0,rear=0,numberOfElements=0;


    public Queue(int size) {
        this.size = size;
        this.stackArray=new String[size];
        Arrays.fill(stackArray,"-1");
    }

    public void insert(String item){

        if(numberOfElements+1<=size){

            stackArray[rear]=item;
            rear++;
            numberOfElements++;
            System.out.println("INSERTED "+item +" in queue array");
        }else{

            System.out.println("queue array is full");
        }
    }

    public void remove(){

        if(numberOfElements>0){
            System.out.println(stackArray[front]+" removed");
            stackArray[front]="-1";
            front++;


        }else{

            System.out.println("queue array is empty");
        }
    }

    public void peek(){

        System.out.println(stackArray[front]+" PEEKED");

    }

    public void display(){

        for(int i=0;i<stackArray.length;i++){

            if(stackArray[i].equals("-1")){

                System.out.println(i+" ");
            }else{

                System.out.println(i+" "+stackArray[i]);
            }


        }



    }


    public void priorityInsert(String item){
        int i;
        if(numberOfElements==0){
            insert(item);
        }else{
            for(i=numberOfElements-1;i>=0;i--){
                if(Integer.parseInt(item)>Integer.parseInt(stackArray[i])){
                    stackArray[i+1]=stackArray[i];
                }else{
                    break;
                }
            }

            stackArray[i+1]=item;
            rear++;
            numberOfElements++;
        }

    }


}
