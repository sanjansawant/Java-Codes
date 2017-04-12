package com.sanjan.algorithms;

/**
 * Created by sanja on 2/4/2017.
 */
public class Queues {

    private static String[] queueArray;
    private static int size=10;
    private static int numberOfelements;
    private static int front;
    private static int rear=0;

    public static void main(String[] args) {

        queueArray=new String[size];



    }

    public static void insert(String input){

        if(numberOfelements+1<size){
            queueArray[rear]=input;
            rear++;
            numberOfelements++;



        }
    }




    public static void remove(){

        queueArray[front]="-1";
        front++;
        numberOfelements--;



    }

    public static void priorityInsert(String input) {


        if(numberOfelements==0){
            insert(input);

        }else{

            for(int i=numberOfelements-1;i>=0;i--){

                int number1=Integer.parseInt(queueArray[i]);
                int number2=Integer.parseInt(input);
                if(number1>number2){
                    int temp=number1;
                    queueArray[i]=input;


                }





            }





        }

    }
}
