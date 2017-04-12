package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
        int result=divide();
        System.out.println(result);
        }catch(NoSuchElementException | ArithmeticException e ){

            System.out.println(e.toString());
        }

        Location location=new Location(1,"sanjan",null);

    }

    public static int divide(){

        int x;
        int y;
        try{
            System.out.println("Enter AN integer");
            x=getInt();
            y=getInt();
            return x/y;
        }catch(NoSuchElementException e){
            throw new NoSuchElementException(" dont press cntr+d");
        }catch(ArithmeticException e){

            throw new ArithmeticException("divide by 0");
        }




    }


    public static int getInt(){
        Scanner input=new Scanner(System.in);
        try {
            return input.nextInt();
        }catch(InputMismatchException e){
            throw new InputMismatchException(" input should be int");


        }
    }

}
