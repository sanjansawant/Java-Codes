package com.sanjan.algorithms;
import java.util.*;
/**
 * Created by sanja on 1/27/2017.
 */
public class Exception2 {

    public static void main(String[] args) {
        int x,y;
        try {
             x = getInt();
            y = getInt();
            int z=divide(x,y);
            System.out.println(z);
        }catch(InputMismatchException e) {
            System.out.println(e.getMessage().toString());
        }

    }

    public static int getInt(){
        Scanner input=new Scanner(System.in);
        try {
            return input.nextInt();
        }catch(InputMismatchException e) {
            System.out.println(e.getMessage().toString());
            return 0;
        }



    }

    public static int divide(int x,int y){
        try {
            return x / y;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage().toString());
            return 0;
        }

    }

}
