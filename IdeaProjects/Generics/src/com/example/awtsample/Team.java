package com.example.awtsample;

import java.util.ArrayList;

/**
 * Created by sanja on 1/10/2017.
 */
public class Team<T extends Player> implements Comparable<Team<T>>{


    private String name;
    private int gamesPlayed=0;
    private int won=0;
    private int loss=0;
    private int tied=0;
    private ArrayList<T> newPlayer=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player){

        if(newPlayer.contains(player)){
            System.out.println(player.getName()+" is already in the team");
            return false;
        }else{
            newPlayer.add(player);
            System.out.println(player.getName()+ " is added");
            return true;
        }

    }

    public int numPlayers(){
        return this.newPlayer.size();
    }

    public void matchResult(Team<T> opponent,int ourScore,int theirScore){
        String message;
        gamesPlayed++;
        if(ourScore>theirScore){
            this.won++;
            message=" won against ";
        }else if(theirScore>ourScore){
            this.loss++;
            message=" lost to ";
        }else{
            this.tied++;
            message=" drew with ";
        }
        if(opponent!=null) {
            System.out.println(this.name+message+opponent.name);
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return ((won*2)+tied);
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()){
            return -1;
        }else if(this.ranking()<team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }

    public String getName() {
        return name;
    }
}
