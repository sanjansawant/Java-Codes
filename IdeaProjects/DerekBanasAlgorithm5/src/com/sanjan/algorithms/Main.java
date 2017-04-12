package com.sanjan.algorithms;

public class Main {

    public static void main(String[] args) {

        getTriangularNumber(3);
        System.out.println(getTriangularNumber2(6));
        System.out.println(factorial(16));
    }




    public static int getTriangularNumber(int number){
        int sum=0;
        for(int i=0;i<number;i++){

            for(int j=0;j<number;j++){

                if(i>=j) {

                    System.out.print(i + 1);
                }
                if(i==j){
                    sum=sum+(i+1);
                }


            }
            System.out.println();

        }
        System.out.println("triangular number "+sum);
        return sum;

    }

    public static int getTriangularNumber2(int number){

       if(number==0){
           return 0;
       }
       return number+getTriangularNumber2(number-1);

    }

    public static long factorial(int number){

        if(number<=1){
            return 1;
        }else{

            return (long)number*factorial((number-1));

        }

    }
}
