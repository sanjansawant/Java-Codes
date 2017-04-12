package com.sanjan.algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

      /*  System.out.println(getIntLBYL());
        System.out.println(getIntLBYL2());*/
        System.out.println(getIntEAFP());

    }


    public static int divideLBYL(int x,int y){

        if(y!=0){

            return x/y;

        }else{
            return 0;
        }
    }


    public static int divideEAFP(int x,int y){

        try{

            return x/y;

        }catch (ArithmeticException e){

            return 0;
        }


    }

    public static int divide(int x,int y){

        return x/y;

    }


    public static int getInt(){

        Scanner input=new Scanner(System.in);
        return input.nextInt();

    }


    public static int getIntEAFP(){

        Scanner input=new Scanner(System.in);

        try{
            System.out.println("finally");
            int number=input.nextInt();
            return number;
        }catch(InputMismatchException e){
            System.out.println("try again");
             int number=getIntEAFP();
            return number;
        }
    }


    public static int getIntLBYL(){

        Scanner input=new Scanner(System.in);
        String number=input.nextLine();

        Pattern pattern=Pattern.compile("\\d*");
        Matcher matcher=pattern.matcher(number);
        if(matcher.matches()){
            System.out.println("here");
            return Integer.parseInt(number);

        }else{

            return 0;
        }

    }

    public static int getIntLBYL2(){

        Scanner input=new Scanner(System.in);
        String number=input.nextLine();

        for(int i=0;i<number.length();i++){

            if(!Character.isDigit(number.charAt(i))){

                return 0;
            }


        }
        return Integer.parseInt(number);


    }
}
