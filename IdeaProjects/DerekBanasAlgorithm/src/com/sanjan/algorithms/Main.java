package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {

        int [] array=new int[10];
        for(int i=0;i<10;i++){

            array[i]= (int)(Math.random()*10)+10;

        }
        display(array);
        System.out.println("================");
        array=insertionSort(array);
        display(array);
        System.out.println("================");
        //binarySearch(array,13);

    }

    public static int[] bubbleSort(int[] array){


        for(int i=array.length-1;i>1;i--){
            for(int j=0;j<i;j++){

                if(array[j]>array[j+1]){

                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }


    public static void display(int[] array){

        for(int i=0;i<array.length;i++){

            System.out.println(array[i]);

        }


    }

    public static boolean binarySearch(int[] array,int number){

        int LI=0;
        int HI=array.length-1;

        while(LI<=HI){
            int MI=(LI+HI)/2;

            if(array[MI]<number){
                LI=MI+1;


            }else if(array[MI]>number){
                HI=MI-1;
            }else{
                System.out.println("Number found at position "+MI);
                LI=HI+1;
                return true;
            }
        }
        System.out.println("number not fond");
        return false;
    }

    public static int[] selectionSort(int[] array){



        for(int i=0;i<array.length;i++){

            int minimum=i;

            for(int j=i;j<array.length;j++){

                if(array[minimum]>array[j]){

                    minimum=j;

                }
            }

            int temp=array[i];
            array[i]=array[minimum];
            array[minimum]=temp;
        }
        return array;
    }

    public static int[] insertionSort(int[] array){

        for(int i=1;i<array.length;i++){
            int j=i;
            int toInsert=array[i];
            while(j>0 && array[j-1]>toInsert){

                array[j]=array[j-1];
                j--;
            }
            array[j]=toInsert;
        }
        return array;

    }


}
