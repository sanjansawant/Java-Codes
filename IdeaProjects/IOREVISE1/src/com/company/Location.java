package com.company;

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
            this.location= new LinkedHashMap<>();
        }else {
            this.location = new LinkedHashMap<>(locate);
        }this.location.put("Q",0);
    }

    private static void heelobutton(){}

    protected void addExit(String des,int number){
        location.put(des,number);
    }

    public String getDescription() {
        return description;
    }

    public int getLocationId() {
        return locationId;
    }

    public Map<String, Integer> getLocation() {

        Division division=new Division(1,"sanjan");
        division.getName();
        return new LinkedHashMap<>(this.location);

    }



    public class Division{

        private int number;
        private String name;

        public Division(int number, String name) {
            this.number=number;
            this.name=name;

        }


        public int getNumber() {

            return number;


        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
