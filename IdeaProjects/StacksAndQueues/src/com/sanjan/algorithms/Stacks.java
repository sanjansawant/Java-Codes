package com.sanjan.algorithms;

import java.util.*;
/**
 * Created by sanja on 1/23/2017.
 */
public class Stacks {
    private String[] stackArray;
    private int size;
    private int topOfStack=-1;


    public Stacks(int size) {
        this.size = size;
        this.stackArray=new String[size];
        Arrays.fill(stackArray,"-1");
    }

    public void push(String input){

        if(topOfStack+1<size){

            topOfStack++;
            stackArray[topOfStack]=input;
            System.out.println("PUSHED "+input+" on stack array");

        }else{

            System.out.println("stack array is full");
        }

    }
    public void peek(){

        if(topOfStack>=0){

            System.out.println("PEEKED "+stackArray[topOfStack]);

        }else{
            System.out.println("stack array is empty");
        }
    }

    public void pop(){

        if(topOfStack>=0){

            System.out.println("POPED "+stackArray[topOfStack]);
            stackArray[topOfStack]="-1";
            topOfStack--;


        }else{

            System.out.println("stack array is empty");

        }


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

    public void popMany(){

        for(int i=topOfStack;i>=0;i--){

            pop();
        }


    }


}
