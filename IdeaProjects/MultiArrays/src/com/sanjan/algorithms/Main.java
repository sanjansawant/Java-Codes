package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {

        int[][] matrix=new int[10][8];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){

                matrix[i][j]=i*j;



            }
        }

        for(int[] i:matrix){

            for(int j:i){


                System.out.print(" "+j+"|");

            }
            System.out.println();

        }

    }
}
