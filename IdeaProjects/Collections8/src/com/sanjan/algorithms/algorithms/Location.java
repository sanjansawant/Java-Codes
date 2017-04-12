package com.sanjan.algorithms.algorithms;

/**
 * Created by sanja on 1/18/2017.
 */

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final String desciption;
    private final int locationID;
    private final Map<String, Integer> exits;

    public Location(String desciption, int locationID, Map<String,Integer> exits) {
        this.desciption = desciption;
        this.locationID = locationID;
        if(exits!=null) {
            this.exits = new HashMap<>(exits);
        }else{
            this.exits=new HashMap<>();
        }this.exits.put("Q",0);
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
