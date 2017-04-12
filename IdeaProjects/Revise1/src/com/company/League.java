package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sanja on 4/8/2017.
 */
public class League<T extends Team> {

    private String name;
    private ArrayList<T> team;

    public League(String name) {
        this.name = name;
        this.team=new ArrayList<>();
    }

    public boolean addTeam(T newTeam){
        if(team.contains(newTeam)){
            System.out.println("Cannot add "+newTeam.getName());
            return false;
        }else{
            team.add(newTeam);
            return true;
        }
    }

    public void teamInOrder(){

        Collections.sort(team);

        for(T i:team){

            System.out.println(i.getName());
        }

    }

}
