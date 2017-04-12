package com.sanjan.algorithms;

/**
 * Created by sanja on 1/17/2017.
 */
import java.util.*;
public class Theatre {
    private final String name;
    private List<Seat> seats=new ArrayList<>();


    public Theatre(String name, int numberOfRows, int seatsPerRow) {
        this.name = name;
        char lastRow=(char)('A'+(numberOfRows-1));

        for(char c='A';c<=lastRow;c++){
            for(int i=1;i<=seatsPerRow;i++){

                String seatNumber=c+String.format("%02d",i);
                Seat seat=new Seat(seatNumber);
                seats.add(seat);

            }

        }
    }

    public boolean requestedSeat(String seatNumber){

        Seat requestedSeat=new Seat(seatNumber);
        int foundSeat=Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat>=0){

            return seats.get(foundSeat).reserve();
        }else{

            System.out.println("there is no seat "+seatNumber);
            return false;
        }
        /*for(Seat seat:seats){
            System.out.printf(".");

            if(seat.getSeatNumber().equalsIgnoreCase(seatNumber)){

                requestedSeat=seat;
                break;
            }

        }
        if(requestedSeat==null){

            System.out.println("There is no seat "+seatNumber);
            return false;
        }
        return requestedSeat.reserve();*/



    }

    public boolean reservedSeat2(String seatNumber){

        int low=0;
        int high=seats.size()-1;
        while(low<=high){
            System.out.printf(".");
            int mi=(low+high)/2;
            int comparison=seats.get(mi).getSeatNumber().compareTo(seatNumber);
            if(comparison<0){
                low=mi+1;
            }else if (comparison>0){
                high=mi-1;

            }else{
                System.out.println(seatNumber+" found");
                return seats.get(mi).reserve();
            }
        }
        System.out.println("seat not found "+seatNumber );
        return false;

    }

    public List<Seat> getSeats(){

        return seats;
    }

    public String getName() {
        return name;
    }

    public class Seat implements Comparable<Seat>{

        private final String seatNumber;
        private boolean isReserved=false;

        public Seat(String seatNumber){

            this.seatNumber=seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve(){

            if(isReserved){
                System.out.println("seat is already reserved");
            }else{

                System.out.println("seat is reserved for you");
                isReserved=true;
                return true;
            }
            return false;
        }

        public boolean cancel(){

            if(isReserved){
                isReserved=false;
                System.out.println("canceeled reservation");
                return true;
            }else{

                System.out.println("seat is free");
                return false;
            }

        }

    }



}
