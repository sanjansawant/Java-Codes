package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Theatre theatre=new Theatre("rmall",8,12);
        //theatre.getSeatsDisplay(););

        if(theatre.binarySearch2("A05")){
            System.out.println("you are successful ");

        }else{
            System.out.println("failed");
        }

        if(theatre.binarySearch2("A05")){
            System.out.println("you are successful ");

        }else{
            System.out.println("failed");
        }

        ArrayList<Theatre.Seat> seats=new ArrayList<>(theatre.getSeats());
        for(Theatre.Seat seat:seats){
            System.out.println(seat.getName());
        }

    }
}
