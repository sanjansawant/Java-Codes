package com.sanjan.algorithms;
import java.util.*;
public class Main {

    private static Scanner input=new Scanner(System.in);
    private static Map<Integer,Location> location=new HashMap<>();
    public static void main(String[] args) {

        Map<String,Integer> tempExit=new HashMap<>();
        location.put(0,new Location(0,"Computer",tempExit));
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        tempExit.put("W",2);
        location.put(1,new Location(1,"road",tempExit));
        tempExit=new HashMap<>();
        tempExit.put("N",5);
        location.put(2,new Location(2,"hill",tempExit));
        tempExit.put("W",1);
        location.put(3,new Location(3,"Building",tempExit));
        tempExit=new HashMap<>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        location.put(4,new Location(4,"Valley",tempExit));
        tempExit=new HashMap<>();
        tempExit.put("S",3);
        tempExit.put("W",2);
        location.put(5,new Location(5,"Forest",tempExit));



        int loc=1;
        while(true){

            System.out.println(location.get(loc).getDescription());
            tempExit.remove("S");
            if(loc==0){
                break;
            }


            System.out.println("Available exits are ");
            Map<String,Integer> exits=new HashMap<>(location.get(loc).getExits());

            for(String dir: exits.keySet()){

                System.out.print(dir+", ");

            }
            System.out.println();
            String direction=input.nextLine().toUpperCase();

            if(location.get(loc).getExits().containsKey(direction)) {
                loc = location.get(loc).getExits().get(direction);
            }else{

                System.out.println("You cannot go in this direction");

            }


        }

    }

}
