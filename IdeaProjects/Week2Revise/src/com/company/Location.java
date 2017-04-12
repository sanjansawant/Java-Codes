package com.company;

/**
 * Created by sanja on 4/9/2017.
 */
import java.util.*;
public class Location {

    private final String description;
    private final int locationId;
    private final Map<String, Integer> exits;

    public Location(String description, int locationId) {
        this.description = description;
        this.locationId = locationId;
        this.exits=new HashMap<>();
    }

    public void addExits(String location, Integer locId){
        this.exits.put(location,locId);
    }


    public String getDescription() {
        return description;
    }

    public int getLocationId() {
        return locationId;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(this.exits);
    }
}
