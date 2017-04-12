package com.example.awtsample;

import java.util.ArrayList;

/**
 * Created by sanja on 1/10/2017.
 */
public class LeagueTable<T extends Team> implements Comparable<T>{

    private String leagueName;
    private ArrayList<T> teams=new ArrayList<>();
    private int ranking;
    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeams(T team){

        if(teams.contains(team)){
            System.out.println(team +" is already present");
            return false;
        }else{
            teams.add(team);
            this.ranking=team.getRanking();
            return true;
        }
    }

    @Override
    public int compareTo(T team){

        if(this.ranking>team.getRanking()){
            return -1;
        }else if(this.ranking<team.getRanking()){
            return 1;
        }else{
            return 0;
        }
    }


    public ArrayList<T> getTeams() {
        return teams;
    }
}
