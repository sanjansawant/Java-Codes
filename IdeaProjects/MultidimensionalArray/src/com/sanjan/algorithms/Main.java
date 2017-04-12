package com.sanjan.algorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[][] myArray = new String[10][10];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {

                myArray[i][j] = i + " " + j;

            }
        }
        int k = 1;
        while (k < 41) {
            System.out.print("-");
            k++;
        }
        System.out.println();

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print("| "+myArray[i][j]+" ");

            }
            System.out.println();
        }

        String[][] newArray=Arrays.copyOf(myArray,myArray.length);
        k = 1;
        while (k < 41) {
            System.out.print("-");
            k++;
        }

        for(String[] row:myArray){

            Arrays.fill(row,"x");
        }


        for(String[] row:myArray){
            for(String column:row){
                System.out.printf("|"+column+" ");
            }
            System.out.println("|");
        }






    }
}
