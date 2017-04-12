package com.sanjan.algorithms.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> location = new HashMap<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Integer> tempExit=new HashMap<>();
        location.put(0, new Location("quit", 0,tempExit));

        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("N", 5);
        tempExit.put("S", 4);
        //tempExit.put(("Q",0);
        location.put(1, new Location("road", 1,tempExit));

        tempExit=new HashMap<>();
        tempExit.put("N", 5);
        //tempExit.put(("Q",0);
        location.put(2, new Location("hill", 2,tempExit));

        tempExit=new HashMap<>();
        tempExit.put("W", 1);
        //tempExit.put(("Q",0);
        location.put(3, new Location("building", 3,tempExit));

        tempExit=new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("N", 1);
        //tempExit.put(("Q",0);
        location.put(4, new Location("valley", 4,tempExit));

        tempExit=new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        location.put(5, new Location("Forest", 5,tempExit));

        Map<String, String> newMAP = new HashMap<>();
        newMAP.put("QUIT", "Q");
        newMAP.put("NORTH", "N");
        newMAP.put("SOUTH", "S");
        newMAP.put("EAST", "E");
        newMAP.put("WEST", "W");

        int loc = 1;
        while (true) {
            System.out.println(location.get(loc).getDesciption());
            tempExit.remove("S");

            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = new HashMap<>(location.get(loc).getExits());

            System.out.println("Available exits are ");
            for (String string : exits.keySet()) {

                System.out.print(string + " , ");

            }

            System.out.println();
            String dir = input.nextLine().toUpperCase();

            String[] array = dir.split(" ");

            if (dir.length() > 1) {

                for (String string : array) {

                    if (newMAP.containsKey(string)) {
                        dir = newMAP.get(string);

                        if (exits.containsKey(dir)) {

                            loc = exits.get(dir);
                            break;

                        } else {

                            System.out.println("you cannot go ahead");
                        }

                    }
                }


            }


            if (exits.containsKey(dir)) {

                loc = exits.get(dir);

            } else {

                System.out.println("you cannot go ahead");
            }


        }
    }
}
