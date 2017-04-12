package com.example.awtsample;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sanja on 1/10/2017.
 */
public class LeagueTable<T extends Team> {

    private String name;
    private ArrayList<T> teams=new ArrayList<T>();

    public LeagueTable(String name) {
        this.name = name;
    }


    public boolean addTeams(T team){

        if(teams.contains(team)){
            System.out.println(team.getName()+" is already in the league");
            return false;
        }else{
            teams.add(team);
            return true;
        }
    }


    public void listLeague(){
        Collections.sort(teams);
        for(T t:teams){

            System.out.println(t.getName()+" ==> "+t.getRanking());
        }


    }

}
