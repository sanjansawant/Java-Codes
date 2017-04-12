package com.company;

import java.util.*;

public class Main1 {
    private static LocationsByte maps = new LocationsByte();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        Map<String, String> words = new HashMap<>();
        words.put("QUIT", "Q");
        words.put("NORTH", "N");
        words.put("SOUTH", "S");
        words.put("EAST", "E");
        words.put("WEST", "W");


        int key = 64;

        while (true) {
            System.out.println("You are at " + maps.get(key).getDescription());
            //temp.remove("S");
            if (key == 0) {

                break;
            }

            for (String directions : maps.get(key).getLocation().keySet()) {

                System.out.print(" " + directions);

            }
            System.out.println();

            System.out.println("Enter the direction you want to go");
            String dir = input.nextLine().toUpperCase();

            String[] array = dir.split(" ");
            if (array.length > 1) {
                for (String word : array) {

                    if (words.containsKey(word)) {
                        dir = words.get(word);

                        if (maps.get(key).getLocation().containsKey(dir)) {
                            key = maps.get(key).getLocation().get(dir);
                            break;
                        } else {
                            System.out.println("you cannot go in that direction");
                        }

                    } else {
                        continue;
                    }


                }
            }else{

                if (maps.get(key).getLocation().containsKey(dir)) {
                    key = maps.get(key).getLocation().get(dir);

                } else {
                    System.out.println("you cannot go in that direction");
                }

            }

        }


    }
}
