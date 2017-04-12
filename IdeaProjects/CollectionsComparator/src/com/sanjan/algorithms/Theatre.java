package com.sanjan.algorithms;

/**
 * Created by sanja on 1/23/2017.
 */

import java.util.*;

public class Theatre {
    private final String name;
    private List<Seat> seats;
    private Comparator<Seat> priceOrder=new Comparator<Seat>() {
        @Override
        public int compare(Seat o1, Seat o2) {
            return o1.getSeat().compareTo(o2.getSeat());
        }
    };

    public Theatre(String name, int totalRows, int seatsPerRow) {
        this.name = name;
        this.seats = new LinkedList<>();
        char c = (char) ('A' + (totalRows - 1));
        for (char d = 'A'; d <= c; d++) {
            for (int i = 1; i <= seatsPerRow; i++) {

                String seat = d + "" + String.format("%02d", i);
                seats.add(new Seat(seat));
            }
        }
    }

    public boolean reserveSeat(Seat seatNumber) {

        for (Seat seat : seats) {
            System.out.println(".");
            if (seat.getSeat().equalsIgnoreCase(seatNumber.getSeat())) {
                if (seat.reserveSeat(seat)) {

                    System.out.println(seatNumber.getSeat() + " pay money");
                    return true;
                } else {

                    System.out.println(seatNumber.getSeat() + " is not reserved");
                    return false;
                }

            }
        } System.out.println(seatNumber.getSeat() + " not found");
        return false;
    }

    public boolean reserveSeat2(Seat seatNumber) {

        int li = 0;
        int hi = seats.size() - 1;

        while (li <= hi) {
            System.out.println(".");
            int mi = (li + hi) / 2;
            int comparison = (seats.get(mi).getSeat().compareTo(seatNumber.getSeat()));
            if (comparison < 0) {


                li = mi + 1;
            } else if (comparison > 0) {

                hi = mi - 1;

            } else {
                li = hi + 1;
                if (!seats.get(mi).reserveSeat(seatNumber)) {
                    System.out.println(seatNumber.getSeat() + " pay money");
                    return true;

                } else {
                    System.out.println(seatNumber.getSeat() + " is not reserved");
                    return false;
                }

            }
        }
        System.out.println(seatNumber.getSeat() + " not found");
        return false;

    }



    public String getName() {
        return name;
    }

    public List<Seat> getSeats() {
        return new LinkedList<>(this.seats);
    }

    public class Seat {

        private String seat;
        private boolean isReserved = false;

        public Seat(String seat) {
            this.seat = seat;
        }

        public boolean reserveSeat(Seat seatNumber) {

            if (isReserved) {
                System.out.println(seatNumber.getSeat() + " is reserved already by someone");
                return isReserved;
            } else {

                System.out.println(seatNumber.getSeat() + " is reserved for you");
                isReserved = true;
                return isReserved;
            }
        }

        public boolean cancelReservation(Seat seatNumber) {

            if (isReserved) {

                System.out.println(seatNumber.getSeat() + " cancelling reservation");
                isReserved = false;
                return true;
            } else {

                System.out.println(seatNumber.getSeat() + " is not reserved");
                return false;
            }


        }


        public String getSeat() {
            return seat;
        }
    }

}
