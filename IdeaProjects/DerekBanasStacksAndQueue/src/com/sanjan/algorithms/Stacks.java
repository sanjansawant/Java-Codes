package com.sanjan.algorithms;

import java.util.Arrays;

/**
 * Created by sanja on 1/23/2017.
 */
public class Stacks {
    private String[] stackArray;
    private int size;
    private int topOfStack=-1;//which is going to symbolize later that it is empty

    public Stacks(int size1){
        this.size=size1;
        this.stackArray=new String[size];
        Arrays.fill(stackArray,"-1");//so that whenever I am displaying what a stack looks like
        //it is going to ignore anything that has negative one inside of it

    }

    public void push(String input){
        if(topOfStack+1<size){
            topOfStack++;
            stackArray[topOfStack]=input;

        }else {
            System.out.println("Sorry Stack is full");
        }
        displayTheStack();
        System.out.println("Push "+ input+" was added to the stack");

    }


    public void displayTheStack(){



        for(int i=0;i<stackArray.length;i++){

            if(stackArray[i].equals("-1")){

                System.out.println(i+"  ");
            }else {

                System.out.println(i + "  " + stackArray[i]);
            }
        }
        System.out.println();


    }

    public void pushMany(String manyItems){

     String[] temp=manyItems.split(" ");


        for(int i=0;i<temp.length;i++){

             push(temp[i]);
        }


     }





    public String pop(){
        if(topOfStack>=0){

            displayTheStack();
            System.out.println("POP "+stackArray[topOfStack]+" was removed from the stack");
            stackArray[topOfStack]="-1";
            return stackArray[topOfStack--];
        }else{

            displayTheStack();
            System.out.println("SOrry but the stack is empty");
            return "-1";
        }


    }


    public void popAll(){
        for(int i=topOfStack;i>=0;i--){

            pop();


        }


    }

    public String peek(){
        displayTheStack();
        System.out.println("PEEK "+stackArray[topOfStack]+" is at the top of the stack\n");
        return stackArray[topOfStack];
    }

    public String[] getStackArray() {
        return stackArray;
    }



}
