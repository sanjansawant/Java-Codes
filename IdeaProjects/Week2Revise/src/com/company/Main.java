package com.company;

import java.util.*;
public class Main {

    private static Map<Integer,Location> locations=new HashMap<>();
    public static void main(String[] args) {

        locations.put(0,new Location("Computer",0));
        locations.put(1,new Location("Road",1));
        locations.put(2,new Location("Hill",2));
        locations.put(3,new Location("Building",3));
        locations.put(4,new Location("Valley",4));
        locations.put(5,new Location("Forest",5));
        Scanner input=new Scanner(System.in);



        int loc=1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }
            System.out.println("Enter direction ");
            loc=input.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("cannot go in "+loc);
            }
        }


    }
}
