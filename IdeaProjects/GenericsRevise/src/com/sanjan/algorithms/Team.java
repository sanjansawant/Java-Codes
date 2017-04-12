package com.sanjan.algorithms;

import java.util.*;


/**
 * Created by sanja on 1/28/2017.
 */
public class Team<T extends CricketPlayer> implements Comparable<Team<T>> {

    private final String name;
    private final int ranking;
    private List<T> listofplayer=new LinkedList<>();

    public Team(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }


    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking>team.ranking){

            return 1;
        }else if(this.ranking<team.ranking){
            return -1;
        }else{
            return 0;
        }
    }

    public void addPlayer(T player){

        listofplayer.add(player);

    }

    public List<T> getListofplayer() {
        Collections.sort(listofplayer);
        return listofplayer;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}
