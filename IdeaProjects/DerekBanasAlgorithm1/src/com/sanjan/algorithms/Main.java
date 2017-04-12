package com.sanjan.algorithms;

public class Main {

    private static int[] theArray=new int[50];
    private static int size=10;
    public static void generateRandomArrat(){

        for(int i=0;i<size;i++){

            theArray[i]=(int)(Math.random()*10)+10;

        }
    }

    public static void printArray(){
        System.out.println("==================================================");
        for(int i=0;i<size;i++){
            System.out.printf("| "+i+" ");
            System.out.printf("|");
        }
        System.out.println("");
        System.out.println("==================================================");
        for(int i=0;i<size;i++){
            System.out.printf("|"+theArray[i]+" ");
            System.out.printf("|");
        }
        System.out.println();
        System.out.println("==================================================");

    }

    public static int getValueAtIndex(int index){

        if(index<size){
            return theArray[index];
        }return 0;
    }

    public static boolean doesArrayContainThisValue(int value){

        for(int i=0;i<size;i++){
            if(theArray[i]==value){
                return true;
            }
        }return false;
    }

    public static void deleteIndex(int index){

        if(index<size){

            for(int i=index;i<size-1;i++){

                theArray[i]=theArray[i+1];
            }

            size--;
        }
    }

    public static void insertValue(int value){
        if(size<50){

            theArray[size]=value;
            size++;
        }

    }

    public static String linearSearch(int value){
        String indexWithVlaue="";
        boolean flag=false;
        System.out.println("The value was found in the following");
        for(int i=0;i<size;i++){

            if(theArray[i]==value){
                flag=true;
                indexWithVlaue+=i+" ";
            }
        }

        if(!flag){

            indexWithVlaue+="None"+" ";
        }
        return indexWithVlaue;


    }

    public static void main(String[] args) {
        generateRandomArrat();
        printArray();
        System.out.println(getValueAtIndex(4));
        System.out.println(doesArrayContainThisValue(14));
        deleteIndex(5);
        printArray();
        insertValue(50);
        printArray();
        System.out.println(linearSearch(15));


    }
}
