package com.sanjan.algorithms;

/**
 * Created by sanja on 1/17/2017.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Theatre {
    private final String name;
    private List<Seat> seats = new ArrayList<>();
    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }


    public Theatre(String name, int numberOfRows, int seatsPerRow) {
        this.name = name;
        char lastRow = (char) ('A' + (numberOfRows - 1));


        for (char c = 'A'; c <= lastRow; c++) {
            for (int i = 1; i <= seatsPerRow; i++) {
                double price=12.00;
                if((c<'D') && (i>=4 && i<=9)){
                    price=14.00;
                }else if ((c>'F') ||(i<4 ||i>9)){
                    price=7.00;
                }

                String seatNumber = c + String.format("%02d", i);
                Seat seat = new Seat(seatNumber,price);
                seats.add(seat);

            }

        }
    }


    public boolean reservedSeat2(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);

        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {

            System.out.println("there is no seat " + seatNumber);
            return false;
        }

    }

    public Collection<Seat> getSeats() {

        return seats;
    }

    public String getName() {
        return name;
    }

    public class Seat implements Comparable<Seat> {

        private final String seatNumber;
        private boolean isReserved = false;
        private double price;

        public Seat(String seatNumber, double price) {

            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {

            if (isReserved) {
                System.out.println("seat is already reserved");
            } else {

                System.out.println("seat is reserved for you");
                isReserved = true;
                return true;
            }
            return false;
        }

        public boolean cancel() {

            if (isReserved) {
                isReserved = false;
                System.out.println("canceeled reservation");
                return true;
            } else {

                System.out.println("seat is free");
                return false;
            }

        }

        public double getPrice() {
            return price;
        }
    }


}
