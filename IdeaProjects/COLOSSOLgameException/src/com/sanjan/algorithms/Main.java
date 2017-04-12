package com.sanjan.algorithms;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    private static Locations locations=new Locations();
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        String timeStamp=new SimpleDateFormat("yyyy/MM/ss hh:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);

        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,2017);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DAY_OF_MONTH,10);

        Date time=cal.getTime();
        DateFormat dff=new SimpleDateFormat("EEEEEEEEEEEEE");
        String time1=dff.format(time);

        System.out.println(time1);



        Map<String, String> exits=new HashMap<>();
        exits.put("QUIT","Q");
        exits.put("EAST","E");
        exits.put("WEST","W");
        exits.put("NORTH","N");
        exits.put("SOUTH","S");


        int loc=1;
        while(true){


            System.out.println(locations.get(loc).getDescription());

            if(loc==0){

                break;
            }

            System.out.println("AValaible exits are ");
            for(String s:locations.get(loc).getLocation().keySet()){

                System.out.print(s+", ");

            }
            System.out.println("");

            System.out.println("WHICH DIRECTION YOU WANT TO GO ");
            String dir=input.nextLine().toUpperCase();





            if(dir.length()>1){

                String[] array=dir.split(" ");

                for(String s:array){

                    if(exits.containsKey(s)){
                        if (locations.get(loc).getLocation().containsKey(exits.get(s))) {

                            loc = locations.get(loc).getLocation().get(exits.get(s));
                            break;
                        }else{

                            System.out.println("CANNOT GO IN THAT DIRECTION");
                        }
                    }
                }




            }else {

                if (locations.get(loc).getLocation().containsKey(dir)) {

                    loc = locations.get(loc).getLocation().get(dir);

                }
            }

        }


    }
}
