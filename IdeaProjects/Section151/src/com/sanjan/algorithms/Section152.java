package com.sanjan.algorithms;

/**
 * Created by sanja on 2/10/2017.
 */

import java.util.*;

public class Section152 {


    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        }catch(NoSuchElementException | ArithmeticException e){

            System.out.println(e.toString());
            System.out.println("shuutting down, unable to perform division");
        }


    }


    public static int divide(){

        int x;
        int y;
        //try{
            x=getInt();
            y=getInt();
            return x/y;

        //}

    }


    public static int getInt() {

        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("here");
                input.nextLine();
                System.out.println("Enter number between one to nine");

            }
        }
    }
}
