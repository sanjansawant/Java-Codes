package com.sanjan.algorithms;

/**
 * Created by sanja on 1/18/2017.
 */
import java.util.*;
public class Location {

    private final String desciption;
    private final int locationID;
    private final Map<String, Integer> exits;

    public Location(String desciption, int locationID) {
        this.desciption = desciption;
        this.locationID = locationID;
        this.exits=new HashMap<>();
        exits.put("Q",0);
    }

    public void addExit(String desciption, int locationID){
        this.exits.put(desciption,locationID);
    }

    public String getDesciption() {
        return desciption;
    }

    public int getLocationID() {
        return locationID;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
