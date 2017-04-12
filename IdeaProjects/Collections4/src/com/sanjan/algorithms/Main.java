package com.sanjan.algorithms;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Theatre theatre=new Theatre("original",8,12);
        //printSeats(theatre.getSeats());
        if(theatre.binaryreserveSeat2("D12")){
            System.out.println("success");
        }else{
            System.out.println("fails");
        }
        if(theatre.reserveSeat("D11")){
            System.out.println("success");
        }else{
            System.out.println("fails");
        }

       List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.getSeats());
       /*seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("success");
        }else{
            System.out.println("fails");
        }*/
       Collections.reverse(seatCopy);
       printSeats(seatCopy);
       Theatre.Seat min_seat=Collections.min(seatCopy);
       Theatre.Seat max_seat=Collections.max(seatCopy);
        System.out.println(min_seat.getSeatNumber()+"   "+max_seat.getSeatNumber());

        System.out.println("=============================");
        bubblesort(seatCopy);
        printSeats(seatCopy);

        String name="5";
        int name1=Integer.parseInt(name);
        String name2=new Integer(name1).toString();

        List<Theatre.Seat> seatCopyNew=new ArrayList<>(theatre.getSeats());
        seatCopyNew.add(theatre.new Seat("A00"));
        seatCopyNew.add(theatre.new Seat("B00"));
        Collections.sort(seatCopyNew,Theatre.newComparator);

    }
    public static void printSeats(List<Theatre.Seat> getSeats){


        for(Theatre.Seat seats: getSeats){

            System.out.println(seats.getSeatNumber());

        }
    }


    public static  void bubblesort(List<? extends Theatre.Seat> list){


        for(int i=(list.size()-1);i>=1;i--){

            for(int j=0;j<i;j++){

                if((list.get(j).getSeatNumber().compareTo(list.get(j+1).getSeatNumber()))>0){

                    Collections.swap(list,j,j+1);

                }

            }
        }
    }
}
