package com.sanjan.algorithms;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("olympian",8,12);

        List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.getSeats());
        printList(seatCopy);

        seatCopy.get(1).reserve();

        theatre.reservedSeat2("A02");

        Collections.shuffle(seatCopy);
        System.out.println("printing seatcopy");
        printList(seatCopy);
        System.out.println("printing original");
        printList(theatre.getSeats());

        Theatre.Seat minSeat=Collections.min(seatCopy);
        Theatre.Seat maxSeat=Collections.max(seatCopy);
        System.out.println(minSeat.getSeatNumber()+" "+maxSeat.getSeatNumber());
        bubbleSort(seatCopy);
        System.out.println("printing seatcopy");
        printList(seatCopy);
        List<Theatre.Seat> newSeatCopy=new ArrayList<>(theatre.getSeats());
        Collections.copy(newSeatCopy,newSeatCopy);


    }

    public static void printList(List<Theatre.Seat> list ){

        for(Theatre.Seat seat:list){

            System.out.print(" "+seat.getSeatNumber());

        }
        System.out.println();
        System.out.println("======================");

    }

    public static void bubbleSort(List<? extends Theatre.Seat> list){

        for(int i=list.size()-1;i>=1;i--){
            for(int j=0;j<i;j++){

                if(list.get(j).getSeatNumber().compareTo(list.get(j+1).getSeatNumber())>0){

                    Collections.swap(list,j,j+1);
                }


            }


        }
    }
}
