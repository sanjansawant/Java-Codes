package com.sanjan.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("olympian",8,12);

        if(theatre.reservedSeat2("D12")){
            System.out.println("pay now");
        }else{
            System.out.println("failed");
        }
        if(theatre.reservedSeat2("B13")){
            System.out.println("pay now");
        }else{
            System.out.println("failed");
        }

        /*List<Theatre.Seat> reverseSeats=new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);*/

        List<Theatre.Seat> price_Seat=new ArrayList<>(theatre.getSeats());
        price_Seat.add(theatre.new Seat("B00",13.00));
        price_Seat.add(theatre.new Seat("A00",13.00));
        Collections.sort(price_Seat,Theatre.PRICE_ORDER);
        printList(price_Seat);
    }

    public static void printList(List<Theatre.Seat> list ){

        for(Theatre.Seat seat:list){

            System.out.print(" "+seat.getSeatNumber()+" $"+seat.getPrice());

        }
        System.out.println();
        System.out.println("======================");

    }










}
