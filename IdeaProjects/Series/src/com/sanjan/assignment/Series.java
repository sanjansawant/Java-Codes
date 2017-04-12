package com.sanjan.assignment;

/**
 * Created by sanja on 1/10/2017.
 */
public class Series {

    public static int nSum(int n){
        int sum=0;

        for(int i=0;i<=n;i++){

            sum=sum+i;
        }
        return sum;
    }


    public static int factorial(int n){

        if(n<=1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    public static int fibonacci(int n){
        if(n==0){
            return n;
        }else if(n==1){
            return n;
        }else{

            return fibonacci(n-1)+fibonacci(n-2);
        }

    }




}
