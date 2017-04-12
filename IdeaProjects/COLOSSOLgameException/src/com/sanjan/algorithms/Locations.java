package com.sanjan.algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by sanja on 2/10/2017.
 */
import java.util.*;
public class Locations implements Map<Integer, Location> {


    private static Map<Integer, Location> locations = new HashMap<>();

    static {



        try (Scanner input=new Scanner(new FileReader("locations_big.txt"))){


            input.useDelimiter(",");
            while(input.hasNext()){

                int number=input.nextInt();
                input.skip(input.delimiter());
                String location=input.nextLine();
                System.out.println(number+" "+location);
                Map<String, Integer> tempExits = new HashMap<>();
                locations.put(number,new Location(number,location,tempExits));

            }
        }catch(IOException e){

            e.printStackTrace();
        }


        try(BufferedReader brr=new BufferedReader(new FileReader("directions_big.txt"))){


            String str;
            while((str=brr.readLine())!=null){


                String[]array=str.split(",");
                int number=Integer.parseInt(array[0]);

                Location location=locations.get(number);
                int number1=Integer.parseInt(array[2]);
                location.addExits(array[1],number1);


            }


        }catch(IOException e){

            e.printStackTrace();
        }



    }

    public static void main(String[] args) throws IOException {




        try(FileWriter locaFile=new FileWriter("locations.txt")){
            for (Location location : locations.values()) {

                locaFile.write(location.getLocationId() + "," + location.getDescription()+"\n");
                //throw new IOException("debugiing");
            }
        }finally {
            System.out.println("I am here");
        }



        FileWriter locaFile=null;
        try{

            locaFile=new FileWriter("directions.txt");
            for(int s:locations.keySet()){

                for(String i:locations.get(s).getLocation().keySet()) {

                    locaFile.write(s + "," + i + ","+locations.get(s).getLocation().get(i)+"\n");
                }
            }
        }catch(IOException e){

            e.printStackTrace();
        }finally {

            if (locaFile != null) {
                locaFile.close();
            }


        }
    }


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

        for (int i : m.keySet()) {

            locations.put(i, m.get(i));
        }
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
