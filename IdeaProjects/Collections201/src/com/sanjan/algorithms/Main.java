package com.sanjan.algorithms;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Theatre oracle = new Theatre("oracle", 8, 12);

        List<Theatre.Seat> seats = oracle.getSeats();
        /*for(int i=0;i<seats.size();i++) {
            System.out.println(seats.get(i).getSeatNumber());
        }*/
        Theatre.Seat newSeat = oracle.new Seat("A13", 60.);
        oracle.addSeat(newSeat);
        newSeat = oracle.new Seat("A14", 50);
        oracle.addSeat(newSeat);
        seats = oracle.getSeats();
     /*   for(int i=0;i<seats.size();i++) {
            System.out.println(seats.get(i).getSeatNumber());
        }
*/
        oracle.findSeat("D12");
        System.out.println();
        oracle.binarySearch("D12");
        System.out.println();

        Theatre.Seat bss = seats.get(14);
//        System.out.println(bss.getSeatNumber());

        if (oracle.binarySearch2(bss)) {

            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        Collections.sort(seats, Theatre.priceOrder);
        for (int i = 0; i < seats.size(); i++) {
            System.out.println(seats.get(i).getSeatNumber());
        }

        /*Theatre.Seat[] arrays=new Theatre.Seat[oracle.getSeats().size()];
        arrays=oracle.getSeats().toArray(arrays);

        List<Theatre.Seat> newList=new ArrayList<Theatre.Seat>(Arrays.asList(arrays));
*/
        List<Theatre.Seat> shallowCopy=new ArrayList<>(oracle.getSeats());
        Collections.shuffle(shallowCopy);
        bubbleSort(shallowCopy);
        System.out.println("=====================================================");
        for (int i = 0; i < shallowCopy.size(); i++) {
            System.out.println(shallowCopy.get(i).getSeatNumber());
        }
    }

    public static void bubbleSort(List<? extends Theatre.Seat> seat) {

        for (int i = (seat.size() - 1); i >= 1; i--) {

            for (int j = 0; j < i; j++) {

                int comparison = seat.get(j).compareTo(seat.get(j + 1));
                if (comparison > 0) {
                    Collections.swap(seat,j,j+1);
                }
            }

        }

    }
}