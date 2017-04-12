package com.sanjan.algorithms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by sanja on 2/10/2017.
 */
public class Locations implements Map<Integer,Location> {

    private static Map<Integer,Location> locations=new HashMap<>();


    static{

        Map<String,Integer> temp=new HashMap<>();
        locations.put(0, new Location(0, "IN front of computer",null));
        temp.put("N", 5);
        temp.put("E", 3);
        temp.put("W", 2);
        temp.put("S", 4);
        locations.put(1, new Location(1, "Road",temp));

        temp=new HashMap<>();
        temp.put("N", 5);
        locations.put(2, new Location(2, "Hill",temp));

        temp=new HashMap<>();
        temp.put("W", 1);
        locations.put(3, new Location(3, "Building",temp));


        temp=new HashMap<>();
        temp.put("N", 1);
        temp.put("E", 2);
        locations.put(4, new Location(4, "Valley",temp));

        temp=new HashMap<>();
        temp.put("S", 1);
        temp.put("E", 2);
        locations.put(5, new Location(5, "Forest",temp));

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
        return locations.put(key,value);
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
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
