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

        if (topOfStack+1<size){

            topOfStack++;
            stackArray[topOfStack]=input;

        }else{

            System.out.println("sorry stack array is full");
            return;
        }

        System.out.println("Push "+input+" was added to the stack successfully");
        displayArray();
    }

    public void pop(){

        if(topOfStack>=0){

            stackArray[topOfStack]="-1";
            topOfStack--;
            displayArray();
        }else{

            System.out.println("stack array is empty");
            //return "-1";
        }

//        return stackArray[topOfStack]+" is now at the end";

    }

    public void peep(){
        if(topOfStack>=0){

            System.out.println(stackArray[topOfStack]+" is at the end of stack");
        }else{

            System.out.println("stack array is empty");

        }
    }


    public void displayArray(){

        for(int i=0;i<stackArray.length;i++){

            if(stackArray[i].equals("-1")){
                System.out.println(i+" ");
            }else{

                System.out.println(i+" "+stackArray[i]);
            }


        }


    }

    public void pushMany(String items){
        String[] temp=items.split(",");
        for(int i=0;i<temp.length;i++){

            push(temp[i]);
        }


    }

    public void popMany(){

        for(int i=topOfStack;i>=0;i--){

            pop();
        }


    }


}
