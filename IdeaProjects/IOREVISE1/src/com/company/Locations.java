package com.company;



import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

/**
 * Created by sanja on 2/10/2017.
 */
public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations = new LinkedHashMap<>();


    static {

        try(BufferedReader input=new BufferedReader(new FileReader("locations_big.txt"))){
            String line;
            while((line=input.readLine())!=null){
               String[] array=line.split(",");


                Map<String,Integer> tempExit=new HashMap<>();
                System.out.println(array[0]+","+array[1]);
                Location location=new Location(Integer.parseInt(array[0]),array[1],tempExit);
                locations.put(Integer.parseInt(array[0]),location);
            }

        }catch(IOException e){
            e.printStackTrace();

        }


        try(BufferedReader bff= new BufferedReader(new FileReader("directions_big.txt"))){
            String input;
            while((input=bff.readLine())!=null){

                /*int number=inputDir.nextInt();
                inputDir.skip(inputDir.delimiter());
                String des=inputDir.next();
                inputDir.skip(inputDir.delimiter());
                String desc=inputDir.nextLine();
                int number2=Integer.parseInt(desc);
                Location location1=locations.get(number);
                System.out.println(number+","+des+","+number2);
                location1.addExit(des,number2);*/
                String[] array=input.split(",");

                Location location1=locations.get(Integer.parseInt(array[0]));
                System.out.println(array[0]+","+array[1]+","+array[2]);
                location1.addExit(array[1],Integer.parseInt(array[2]));


            }
        }catch(IOException e){

            e.printStackTrace();
        }
    }






     /*   Map<String, Integer> temp = new HashMap<>();
        locations.put(0, new Location(0, "IN front of computer", temp));
        temp.put("N", 5);
        temp.put("E", 3);
        temp.put("W", 2);
        temp.put("S", 4);
        locations.put(1, new Location(1, "Road", temp));

        temp = new HashMap<>();
        temp.put("N", 5);
        locations.put(2, new Location(2, "Hill", temp));

        temp = new HashMap<>();
        temp.put("W", 1);
        locations.put(3, new Location(3, "Building", temp));


        temp = new HashMap<>();
        temp.put("N", 1);
        temp.put("E", 2);
        locations.put(4, new Location(4, "Valley", temp));

        temp = new HashMap<>();
        temp.put("S", 1);
        temp.put("E", 2);
        locations.put(5, new Location(5, "Forest", temp));

        *//**//*FileWriter dir = null;
        try {
            dir = new FileWriter("directions.txt");
            for (Location i : locations.values()) {
                for (String string : i.getLocation().keySet()) {
                    System.out.println(i.getLocationId());
                    dir.write(i.getLocationId() + "," + string + "," + i.getLocation().get(string) + "\n");

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (dir != null) {
                    dir.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }*/



    public static void main(String[] args) throws IOException {


        //BufferedWriter file = null;
       // BufferedWriter dir = null;
        try( BufferedWriter file=new BufferedWriter(new FileWriter("locations.txt"))) {
            for (Location i : locations.values()) {

                file.write(i.getLocationId() + "," + i.getDescription() + "\n");

            }

        }

        try(BufferedWriter dir=new BufferedWriter(new FileWriter("directions.txt"))) {

            for (Location i : locations.values()) {

                //file.write(i.getLocationId() + "," + i.getDescription() + "\n");
                for (String string : i.getLocation().keySet()) {
                    if(string.equalsIgnoreCase("Q")){

                    }else {

                        dir.write(i.getLocationId() + "," + string + "," + i.getLocation().get(string) + "\n");
                    }
                }


            }

        }
    }


        /*try {
            file = new FileWriter("locations.txt");
            dir = new FileWriter("directions.txt");
            for (Location i : locations.values()) {

                file.write(i.getLocationId() + "," + i.getDescription() + "\n");
                for (String string : i.getLocation().keySet()) {

                    dir.write(i.getLocationId() + "," + string + "," + i.getLocation().get(string) + "\n");

                }
            }
        } finally {

            if (file != null && dir != null) {
                System.out.println("Inside finally block");
                file.close();
                dir.close();
            }
        }*/



    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
