package com.company;

import java.io.*;
import java.util.*;

/**
 * Created by sanja on 2/15/2017.
 */
public class LocationsByte implements Map<Integer, Location>{
    private static Map<Integer, Location> locations = new LinkedHashMap<>();


    static {



        try(DataInputStream input=new DataInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))){
            boolean eof=true;

            while(eof) {
                try {

                    Map<String, Integer> tempExits = new LinkedHashMap<>();
                    int number = input.readInt();
                    String des = input.readUTF();

                    int number1 = input.readInt();
                    for (int i = 0; i < number1; i++) {
                        String dir = input.readUTF();
                        int destination = input.readInt();

                        tempExits.put(dir, destination);

                    }
                    locations.put(number, new Location(number, des, tempExits));

                }catch(EOFException e){
                    eof=false;
                }
            }


        }catch(IOException e){
            System.out.println("cauht you");
        }

    }

    public static void main(String[] args) throws IOException {
        DataOutputStream locFile=null;
        try{

          locFile=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")));
          for(Location i:locations.values()){

              locFile.writeInt(i.getLocationId());
              locFile.writeUTF(i.getDescription());
              System.out.println("Writing "+i.getLocationId()+" : "+i.getDescription());
              System.out.println(i.getLocation().size()-1+" exits.");
              locFile.writeInt(i.getLocation().size()-1);
              for(String string:i.getLocation().keySet()){

                  if (string.equalsIgnoreCase("Q")){

                  }else{

                      System.out.println("\t\t"+string+","+i.getLocation().get(string));
                      //locFile.writeInt(i.getLocationId());
                      locFile.writeUTF(string);
                      locFile.writeInt(i.getLocation().get(string));
                  }


              }
          }



        }finally {

            if(locFile!=null){
                locFile.close();
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
    public Set<Map.Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }

}
