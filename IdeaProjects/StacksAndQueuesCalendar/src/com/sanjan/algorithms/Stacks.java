package com.sanjan.algorithms;

import java.util.Arrays;

/**
 * Created by sanja on 2/4/2017.
 */
public class Stacks {

    private static String[] stackArray;
    private static int size=10;
    private static int topOfStack=-1;


    public static void main(String[] args) {
        stackArray=new String[size];
        Arrays.fill(stackArray,"-1");
        push("0");
        push("1");
        push("2");
        push("3");
        push("4");
        push("5");
        pop();
        pop();
        push("0");
        push("1");
        push("2");
        push("3");
        push("4");
        push("5");
        display();



    }
    public static void push(String input){

        if(topOfStack<size && input!=null){

            topOfStack++;
            stackArray[topOfStack]=input;

        }
        display();


    }


    public static void pop(){

        if(topOfStack>=0){

            stackArray[topOfStack]="-1";
            topOfStack--;

        }
        display();
    }

    public static void display(){
        System.out.println("=========================");
        for(int i=0;i<size;i++){

            if(stackArray[i].equals("-1")){

                continue;
            }else{

                System.out.println(stackArray[i]);
            }



        }

    }

}
