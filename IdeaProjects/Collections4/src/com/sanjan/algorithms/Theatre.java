package com.sanjan.algorithms;

/**
 * Created by sanja on 1/18/2017.
 */
import java.util.*;
public class Theatre {

    private String name;
    private List<Seat> seats=new ArrayList<>();

    static final Comparator<Seat> newComparator=new Comparator<Seat>() {
        @Override
        public int compare(Seat o1, Seat o2) {
            return o1.compareTo(o2);
        }
    } ;

    public Theatre(String name, int numberOfRows, int seatsPerRow) {
        this.name = name;
        char lastRow=(char)('A'+(numberOfRows-1));

        for(char c='A';c<=lastRow;c++){
            for(int i=1;i<=seatsPerRow;i++){

                seats.add(new Seat(c+String.format("%02d",i)));

            }

        }
    }


    public List<Seat> getSeats() {
        return seats;
    }

    public boolean reserveSeat(String seatNumber){

        for(Seat seat:seats){
            System.out.print(".");
            if(seat.getSeatNumber().equalsIgnoreCase(seatNumber)){

                return seat.reserve();
            }
        }
        System.out.println("seat not found");
        return false;
    }


    public boolean binaryreserveSeat(String seatNumber){

        int foundSeat=Collections.binarySearch(seats,new Seat(seatNumber),null);
        if(foundSeat>=0) {
            return seats.get(foundSeat).reserve();
        }else{
            return false;
        }
    }


    public boolean binaryreserveSeat2(String seatNumber){

        int li=0;
        int hi=seats.size()-1;

        while(li<=hi){
            System.out.print(".");
            int mi=(li+hi)/2;

            if(seats.get(mi).getSeatNumber().compareTo(seatNumber)<0){

                li=mi+1;

            }else if(seats.get(mi).getSeatNumber().compareTo(seatNumber)>0){

                hi=mi-1;
            }else{

                return seats.get(mi).reserve();

            }




        }
        System.out.println("seat not found");
        return false;

    }


    public class Seat implements Comparable<Seat>{

        private String seatNumber;
        public boolean isReserved=false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat s1) {
            return (seatNumber.compareToIgnoreCase(s1.getSeatNumber()));
        }

        public boolean reserve(){

            if(!isReserved){
                System.out.println("seat is free go ahead");
                isReserved=true;
                return true;
            }else{
                System.out.println("seat is already reserved");
                return false;
            }

        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
