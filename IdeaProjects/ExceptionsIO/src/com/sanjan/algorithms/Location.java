package com.sanjan.algorithms;

/**
 * Created by sanja on 2/10/2017.
 */
import java.util.*;
public class Location {

    private final String description;
    private final int locationId;
    private Map<String,Integer> location;

    public Location(int locationID, String description, Map<String,Integer> locate){
        this.description=description;
        this.locationId=locationID;
        if(locate==null){
            this.location= new HashMap<>();
        }else {
            this.location = new HashMap<>(locate);
        }
    }







    public String getDescription() {
        return description;
    }

    public int getLocationId() {
        return locationId;
    }

    public Map<String, Integer> getLocation() {
        return new HashMap<>(this.location);
    }
}
