package com.sanjan.algorithms;

import java.util.*;
public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a String");
        String pallindrome=input.nextLine();



        String[] array=pallindrome.split("");

        for(int i=0;i<array.length;i++){
            int topOfStack=i;

            for(int j=array.length-1;j>=0;j--){
                int rear=j;

                if(!array[topOfStack].equalsIgnoreCase(array[rear])){
                    continue;
                }else{

                    if(checkStatus(array,topOfStack,rear)){
                        System.out.println(topOfStack+" "+rear);
                        System.out.println("hurray");

                    }else{

                        System.out.println("not hurray");
                    }
                }


            }



        }

    }


    public static boolean checkStatus(String[] array, int start, int end){


        boolean flag=true;

        int mi=(start+end)/2;
        mi+=0.5;


        while(flag){
            if(array[start].equalsIgnoreCase(array[end])){

                    start++;
                    if(start==mi){

                        break;

                    }

                    end--;



                }else{

                    flag=false;
                    return flag;
                }
        }

        return flag;
    }




    }


