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
        System.out.println("The value "+value+ " was found in the following");
        for(int i=0;i<size;i++){

            if(theArray[i]==value){
                flag=true;
                indexWithVlaue+=i+" ";
            }
            printArray();
            System.out.println(" "+i);
        }

        if(!flag){

            indexWithVlaue+="None"+" ";
        }
        return indexWithVlaue;


    }


    public static void bubbleSort(){

        for(int i=size-1;i>1;i--){
            for(int j=0;j<i;j++){


                if(theArray[j]>theArray[j+1]){

                    swapValues(j,j+1);
                    printArray();
                }
            }

        }


    }


    public static void binarySearch(int number){

        int lowIndex=0;
        int highIndex=size-1;

        while(lowIndex<=highIndex){
            int middleIndex=(lowIndex+highIndex)/2;
            if(theArray[middleIndex]<number){


                lowIndex=middleIndex+1;
            }else if(theArray[middleIndex]>number){
                highIndex=middleIndex-1;
            }else{

                System.out.println("\nFound a match for "+number+" at index "+middleIndex);
                lowIndex=highIndex+1;
            }
        }

    }



    public static void selectionSort(){


        for(int i=0;i<size;i++){
            int minimm=i;
            for(int j=i;j<size;j++){

                if(theArray[minimm]>theArray[j]){

                    minimm=j;
                }

            }
            swapValues(i,minimm);
            printArray();
        }

    }


    public static void swapValues(int i,int j){

        int temp=theArray[i];
        theArray[i]=theArray[j];
        theArray[j]=temp;

    }

    public static void insertionSort(){

        for(int i=1;i<size;i++){
            int j=i;
            int toInsert=theArray[i];
            while((j>0) && (theArray[j-1]>toInsert)){

                theArray[j]=theArray[j-1];
                j--;
                printArray();
            }

            theArray[j]=toInsert;
            printArray();
            System.out.println("\n theArray[i]= "+theArray[i]+" array[j]= "+theArray[j]
            +" to insert= "+toInsert);

        }


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
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&777777");
       /* bubbleSort();
        binarySearch(12);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&777777");*/

        insertionSort();



    }
}
