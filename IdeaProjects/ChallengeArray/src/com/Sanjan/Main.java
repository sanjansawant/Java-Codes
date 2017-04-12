package com.Sanjan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        int[] myArray=getIntegers(6);
        printArray(myArray);
        int[] newArray=sortIntegers(myArray);
        printArray(newArray);
    }

    public static int[] getIntegers(int number){

        int[] array=new int[number];

        for(int i=0;i<array.length;i++){

            array[i]=input.nextInt();

        }
        return array;
    }

    public static void printArray(int[] array){

        for(int i=0;i<array.length;i++){

            System.out.println("Element at "+i +", is "+array[i]);
        }
    }


    public static int[] sortIntegers(int[] array){


        int[] newArray=Arrays.copyOf(array,array.length);
        boolean flag=true;

        while(flag){
            flag=false;
            for(int i=0;i<newArray.length-1;i++){

                if(newArray[i]<newArray[i+1]){
                    int temp=newArray[i];
                    newArray[i]=newArray[i+1];
                    newArray[i+1]=temp;
                    flag=true;
                }
            }

        }
        return newArray;
    }

}
