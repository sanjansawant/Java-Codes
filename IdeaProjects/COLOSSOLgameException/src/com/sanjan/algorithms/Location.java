package com.sanjan.algorithms;

/**
 * Created by sanja on 2/10/2017.
 */

import java.util.*;

public class Location {

    private final int locationId;
    private final String description;
    private final Map<String, Integer> location;


    public Location(int locationId, String description, Map<String, Integer> location) {
        this.locationId = locationId;
        this.description = description;
        if (location == null) {
            this.location = new HashMap<>();

        } else {

            this.location = new HashMap<>(location);
            this.location.put("Q",0);
        }

    }

    protected void addExits(String des, int number){

        location.put(des,number);
    }


    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }



    public Map<String, Integer> getLocation() {
        return new HashMap<>(this.location);
    }
}
