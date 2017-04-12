package com.sanjan.algorithms;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {



        int x=98;
        int y=0;
        int z=divideEAFP(x,y);
        System.out.println(z);
        input.nextLine();
        int f=getIntLBYL();
        System.out.println(f);


    }

    public static int divideLBYL(int x,int y){

      if(y==0){
          y=input.nextInt();
          int z=divideLBYL(x,y);
            return z;
      }
      int z= x/y;
      return z;
    }

    public static int divideEAFP(int x,int y){

        try{
            return x/y;
        }catch(ArithmeticException e){
            System.out.println("enter value of y");
            try {
                y = input.nextInt();
                int z=divideEAFP(x,y);
                return z;
            }catch(InputMismatchException f){
                return 0;
            }
        }
    }


    public static int getIntEAFP(){
        System.out.println("Enter a number");
        try{
            return input.nextInt();
        }catch(InputMismatchException e){

            return 0;
        }

    }

    public static int getIntLBYL(){

        String number=input.nextLine();

        boolean flag=true;
        for(int i=0;i<number.length();i++) {

            if(!Character.isDigit(number.charAt(i))){
                flag=false;
                break;
            }
        }

        if(!flag){
            return 0;

        }else{
            return Integer.parseInt(number);
        }

    }

}
