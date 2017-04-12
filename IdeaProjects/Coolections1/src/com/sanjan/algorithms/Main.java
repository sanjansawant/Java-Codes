package com.sanjan.algorithms;
public class Main {


    public static void main(String[] args) {

        Theatre newOne=new Theatre("Adlabs",8,12);
        //newOne.getSeats();
        if(newOne.reservedSeat2("A13")){

            System.out.println("pay now");

        }else{
            System.out.println("failed");
        }

        if(newOne.reservedSeat2("A11")){

            System.out.println("pay now");

        }else{
            System.out.println("failed");
        }



    }
}
