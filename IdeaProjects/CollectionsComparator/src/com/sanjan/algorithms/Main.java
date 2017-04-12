package com.sanjan.algorithms;

import java.util.List;
public class Main {

    public static void main(String[] args) {

        Theatre theatre=new Theatre("Regal",8,12);
        List<Theatre.Seat> seats=theatre.getSeats();

        for(Theatre.Seat seat:seats){

            System.out.println(seat.getSeat());

        }
        System.out.println("=========================");

        Theatre.Seat seat=theatre.new Seat("D12");

        theatre.reserveSeat(seat);
        theatre.reserveSeat(seat);
    }
}
