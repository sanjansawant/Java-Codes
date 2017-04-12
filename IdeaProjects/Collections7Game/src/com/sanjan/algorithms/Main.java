package com.sanjan.algorithms;

import java.util.*;

public class Main {
    private static Map<Integer, Location> location = new HashMap<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        location.put(0, new Location("quit", 0));
        location.put(1, new Location("road", 1));
        location.put(2, new Location("hill", 2));
        location.put(3, new Location("building", 3));
        location.put(4, new Location("valley", 4));
        location.put(5, new Location("Forest", 5));


        Map<String, Integer> tempExit=new HashMap<>();


        location.get(1).addExit("W", 2);
        location.get(1).addExit("E", 3);
        location.get(1).addExit("N", 5);
        location.get(1).addExit("S", 4);
        //location.get(1).addExit("Q",0);

        location.get(2).addExit("N", 5);
        //location.get(2).addExit("Q",0);

        location.get(3).addExit("W", 1);
        //location.get(3).addExit("Q",0);

        location.get(4).addExit("W", 2);
        location.get(4).addExit("N", 1);
        //location.get(4).addExit("Q",0);

        location.get(5).addExit("S", 1);
        location.get(5).addExit("W", 2);


        Map<String, String> newMAP = new HashMap<>();
        newMAP.put("QUIT", "Q");
        newMAP.put("NORTH", "N");
        newMAP.put("SOUTH", "S");
        newMAP.put("EAST", "E");
        newMAP.put("WEST", "W");

        int loc = 1;
        while (true) {
            System.out.println(location.get(loc).getDesciption());

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
