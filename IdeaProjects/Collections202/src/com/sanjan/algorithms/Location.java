package com.sanjan.algorithms;

import java.util.*;
/**
 * Created by sanja on 1/30/2017.
 */
public class Location {
    private final String name;
    private final int locationId;
    private Map<String,Integer> locations;

    public Location(int locationId,String name, Map<String,Integer> exits) {
        this.name = name;
        this.locationId = locationId;
        if(exits!=null) {
            locations = new HashMap<>(exits);
        }else{
            System.out.println("no exits");
            locations = new HashMap<>();
        }        locations.put("Q",0);
    }


  /*  public void addExits(String name, int location){

        this.locations.put(name,location);

    }*/



    public String getName() {
        return name;
    }

    public int getLocationId() {
        return locationId;
    }

    public Map<String, Integer> getLocations() {
        return new HashMap<>(this.locations);
    }
}
