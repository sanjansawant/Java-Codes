package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * Created by sanja on 2/22/2017.
 */
public class Partioning {

    private static int[] array;
    public static void main(String[] args) {
        Partioning partioning=new Partioning(10);
        System.out.println(Arrays.toString(Partioning.array));
        partioning.quickSort(0,9);
        System.out.println(Arrays.toString(Partioning.array));

    }





    public Partioning(int size){

        array=new int[size];
        for(int i=0;i<size;i++){

            array[i]=(int)(Math.random()*60)+1;

        }

    }


    public static void quickSort(int left, int right){


        if(right-left<=0){

            return;
        }else{

            int pivot=array[right];
            int pivotLocation=setPivot(left,right,pivot);
            quickSort(left,pivotLocation-1);
            quickSort(pivotLocation+1,right);
        }



    }



    public static int setPivot(int left,int right,int pivot){

        int leftPointer=left-1;
        int rightPonter=right;

        while(true){

            while(leftPointer<array.length-1 && array[++leftPointer]<pivot);

            while(rightPonter>0 && array[--rightPonter]>pivot);

            if(leftPointer>=rightPonter){
                break;
            }else{

                int temp=array[leftPointer];
                array[leftPointer]=array[rightPonter];
                array[rightPonter]=temp;
            }


        }
        int temp=array[leftPointer];
        array[leftPointer]=array[right];
        array[right]=temp;
        return leftPointer;

    }

}
