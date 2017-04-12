package com.sanjan.algorithms;

/**
 * Created by sanja on 1/18/2017.
 */
import java.util.*;
public class Location {
    private final String description;
    private final int locationID;
    private final Map<String, Integer> exits;

    public Location(int locationID,String description) {
        this.description = description;
        this.locationID = locationID;
        this.exits=new HashMap<>();
        this.exits.put("Q",0);
    }



    public void addExit(String direction, int location){
        exits.put(direction,location);
    }

    public String getDescription() {
        return description;
    }

    public int getLocationID() {
        return locationID;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
