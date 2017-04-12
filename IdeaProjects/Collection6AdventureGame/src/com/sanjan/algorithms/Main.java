package com.sanjan.algorithms;

import java.util.*;
public class Main {
    private static Map<Integer,Location> location=new HashMap<>();
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        location.put(0,new Location(0,"You are sitting in front of a computer learning java"));
        location.put(1,new Location(1,"you are sitting at the end of a road before small brick building"));
        location.put(2,new Location(2,"you are at the top of the hill"));
        location.put(3,new Location(3,"you are inside a building,a well house for small spring"));
        location.put(4,new Location(4,"you are in a valley beside the stream"));
        location.put(5,new Location(5,"you are in the forest"));

        location.get(1).addExit("W",2);
        location.get(1).addExit("E",3);
        location.get(1).addExit("N",5);
        location.get(1).addExit("S",4);
        //location.get(1).addExit("Q",0);

        location.get(2).addExit("N",5);
        //location.get(2).addExit("Q",0);

        location.get(3).addExit("W",1);
        //location.get(3).addExit("Q",0);

        location.get(4).addExit("W",2);
        location.get(4).addExit("N",1);
        //location.get(4).addExit("Q",0);

        location.get(5).addExit("S",1);
        location.get(5).addExit("W",2);
        //location.get(5).addExit("Q",0);
        int loc=1;
        while(true){
            System.out.println(location.get(loc).getDescription());
            if(loc==0){
                break;
            }

            //loc=input.nextInt();

            Map<String,Integer> exits=location.get(loc).getExits();
            System.out.printf("Avaliable exits are ");
            for(String exit: exits.keySet()){

                System.out.print(exit+" , ");
            }
            System.out.println();


            String direction=input.nextLine().toUpperCase();

            if(exits.containsKey(direction)){

                loc=exits.get(direction);
            }else{
                System.out.println("You cannot go in that direction");
            }



        }



    }
}
