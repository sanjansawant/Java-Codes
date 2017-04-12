package com.sanjan.algorithms;

import java.util.*;

/**
 * Created by sanja on 1/28/2017.
 */
public class Theatre {

    private final String name;
    private List<Seat> seats;
    private double price;
    public static final Comparator<Seat> priceOrder=new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice()<seat2.getPrice()){
                return -1;
            }else if(seat1.getPrice()>seat2.getPrice()){
                return 1;
            }else{
                return 0;
            }
        }
    };
    public Theatre(String name, int numberOfRows, int seatsPerRow) {
        this.name = name;
        this.seats = new ArrayList<>();
        char c = (char) ('A' + (numberOfRows - 1));
        for (char d = 'A'; d <= c; d++) {

            for (int i = 1; i <= seatsPerRow; i++) {
                if(d>='A' && d<='C'){
                    this.price=100.00;
                }else if(d>='D' && d<='F'){
                    this.price=120;
                }else{
                    this.price=140;
                }
                Seat seat = new Seat(d + String.format("%02d", i),price);
                seats.add(seat);
            }
        }




    }


    public String getName() {
        return name;
    }

    public List<Seat> getSeats() {
        Collections.sort(this.seats);
        return new ArrayList<>(this.seats);
    }

    public boolean reserveSeat(Seat seatNumber) {

        if (this.seats.contains(seatNumber)) {

            return seatNumber.reserve();
        } else {

            System.out.println("Seat not available in the list");
            return false;
        }

    }

    public boolean addSeat(Seat seatNumber) {
        if (seats.contains(seatNumber)) {
            System.out.println("Seat is present already");
            return false;
        } else {
            seats.add(seatNumber);
            return true;
        }
    }


    public boolean findSeat(String seatNumber) {

        for (int i = 0; i < seats.size(); i++) {
            System.out.print(".");
            if (seats.get(i).getSeatNumber().equals(seatNumber)) {
                System.out.println(seatNumber + " found");
                return true;
            }
        }
        return false;

    }


    public boolean binarySearch(String seatNumber) {
        int li = 0;
        int hi = seats.size() - 1;
        while (li <= hi) {
            System.out.print("*");
            int mi = (li + hi) / 2;
            int comparison = seats.get(mi).getSeatNumber().compareTo(seatNumber);
            if (comparison < 0) {
                li = mi + 1;
            } else if (comparison > 0) {

                hi = mi - 1;
            } else {

                System.out.println(seatNumber + " found");
                return true;

            }
        }
        return false;
    }


    public boolean binarySearch2(Seat seatNumber) {

        if (findSeat(seatNumber.getSeatNumber())) {
            Collections.binarySearch(seats, seatNumber, null);
            return true;
        } else {
            System.out.println("seat not found");
            return false;
        }

    }




    public class Seat implements Comparable<Seat> {

        private final String seatNumber;
        private boolean isReserved = false;
        private double price;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price=price;
        }


        public boolean reserve() {

            if (isReserved) {
                System.out.println("seat is not available for you " + getSeatNumber());
                return false;
            } else {
                System.out.println("seat is reserved for you " + getSeatNumber());
                isReserved = true;
                return true;
            }


        }


        @Override
        public int compareTo(Seat newSeat) {
            return this.seatNumber.compareTo(newSeat.seatNumber);
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}
