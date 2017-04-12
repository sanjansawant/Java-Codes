package com.company;

/**
 * Created by sanja on 4/12/2017.
 */
import java.util.*;
public class Theatre {

    private final String name;
    private final List<Seat> seats;

    public Theatre(String name, int numberOfRows, int seatsPerRow) {
        this.name = name;
        this.seats=new ArrayList<>();
        char first='A';
        char last=(char)(first+(numberOfRows-1));
        for(char i=first;i<=last;i++){
            for(int j=1;j<=seatsPerRow;j++){

                String s=i+String.format("%02d",j);
                Seat seat=new Seat(s);
                seats.add(seat);
            }
        }

    }


    public void getSeatsDisplay(){

        for(Seat seat: seats){
            System.out.println(seat.getName());
        }

    }

    public List<Seat> getSeats() {
        return seats;
    }

    public boolean binarySearch2(String seatNumber){

        int li=0;
        int hi=seats.size()-1;

        while(li<=hi){

            int mi=(li+hi)/2;
            int result=seats.get(mi).getName().compareTo(seatNumber);
            if(result<0){
                li=mi+1;

            }else if(result>0){
                hi=mi-1;
            }else{
                return seats.get(mi).reserve();

            }


        }
        return false;

    }



    public boolean binarySearch(String seatNumber){
        Seat seat=new Seat(seatNumber);
        int foundSeat=Collections.binarySearch(seats,seat,null);
        if(foundSeat>=0){

            return seats.get(foundSeat).reserve();

        }
        System.out.println("not found "+seatNumber);
        return false;

    }




    public boolean reserveSeat(String seatNumber){

        for(Seat seat:seats){
            System.out.printf(".");
            if(seat.getName().equals(seatNumber)){

                return seat.reserve();

            }

        }
        System.out.println(seatNumber+" not found");
        return false;

    }


    public class Seat implements Comparable<Seat>{

        private String name;
        private boolean isReserved;

        public Seat(String name) {
            this.name = name;
            isReserved=false;
        }


        @Override
        public int compareTo(Seat seat) {
            return this.name.compareTo(seat.getName());
        }

        public boolean reserve(){

            if(this.isReserved){
                System.out.println(this.name+" is already reserved");
                return false;
            }else{

                System.out.println(this.name+" is reserved for you");
                this.isReserved=true;
                return true;
            }

        }

        public String getName() {
            return name;
        }
    }
}
