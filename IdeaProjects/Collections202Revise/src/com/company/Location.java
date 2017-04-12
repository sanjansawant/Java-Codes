package com.company;

/**
 * Created by sanja on 3/7/2017.
 */
import java.util.*;
public class Location {

    private String description;
    private int locationId;
    private Map<String,Integer> location;


    public Location(String description, int locationId, Map<String, Integer> location) {
        this.description = description;
        this.locationId = locationId;
        if(location==null){
            this.location=new HashMap<>();
        }else {
            this.location = new HashMap<>(location);
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
