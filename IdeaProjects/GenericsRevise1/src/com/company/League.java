package com.company;

/**
 * Created by sanja on 4/3/2017.
 */
import java.util.*;
public class League<T extends Team> {

    private String name;
    private ArrayList<Team> names;

    public League(String name) {
        this.name = name;
        this.names=new ArrayList<>();
    }


    public void addTeam(T t){
        names.add(t);
    }
    public void showLeague(){
        Collections.sort(names);
    }

}
