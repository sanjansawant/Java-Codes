package com.Sanjan;
import java.util.*;
//Resizing of an array
public class Main {
    private static Scanner input=new Scanner(System.in);
    private static int[] baseArray=new int[10];

    public static void main(String[] args) {

        System.out.println("Enter 10 numbers");
        getArray();
        printArray();
        System.out.println("Enter 12 numbers");
        int [] newArray=resizeArray();
        newArray[10]=54;
        newArray[11]=55;
        printArray();
    }

    public static void getArray(){

        for(int i=0;i<baseArray.length;i++){

            baseArray[i]=input.nextInt();
        }
    }

    public static void printArray(){

        for(int i=0;i<baseArray.length;i++){

            System.out.print(baseArray[i]+" ");
        }
        System.out.println();
    }

    public static int[] resizeArray(){

        int[] array=Arrays.copyOf(baseArray,baseArray.length);
        baseArray=new int[12];

        for(int i=0;i<array.length;i++){

            baseArray[i]=array[i];
        }
        return baseArray;


    }


}
