package com.sanjan.algorithms;

import java.util.*;

/**
 * Created by sanja on 1/23/2017.
 */
public class Queue {

    private String[] queueArray;
    private int size;
    private int front = 0, rear = 0, numberOfElements = 0;

    public Queue(int size) {
        this.size = size;
        this.queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input) {


        if (numberOfElements + 1 < size) {

            queueArray[rear] = input;
            rear++;
            numberOfElements++;
            System.out.println("INSERTED " + input + " in the queue array");
        } else {

            System.out.println("array is full");
        }
    }

    public void peek() {


        System.out.println(queueArray[front] + " PEEKED");
    }

    public void pop() {


        if (numberOfElements > 0) {

            System.out.println(queueArray[front] + " removed");
            queueArray[front] = "-1";
            front++;
        } else {

            System.out.println("queue array is empty");
        }


    }

    public void displayArray() {

        for (int i = 0; i < queueArray.length; i++) {

            if (queueArray[i].equals("-1")) {
                System.out.println(i + " ");
            } else {

                System.out.println(i + " " + queueArray[i]);
            }


        }


    }

    public void priorityQueue(String input) {

        int i;
        if (numberOfElements == 0) {
            insert(input);
        } else {


            for (i = numberOfElements - 1; i >= 0; i--) {

                if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {

                    queueArray[i+1] = queueArray[i];

                } else {
                    break;
                }
            }
            queueArray[i + 1] = input;
            rear++;
            numberOfElements++;

        }
    }


}
