package com.example.awtsample;

import java.util.ArrayList;

/**
 * Created by sanja on 1/10/2017.
 */
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int win=0;
    private int loss=0;
    private int played=0;
    private int tied=0;
    private int ranking;

    private ArrayList<T> players;

    public Team(String name) {
        this.name = name;
        this.players=new ArrayList<>();
    }



    public boolean addMember(T player){


        if(players.contains(player)){
            System.out.println(player.getName()+" is already present");
            return false;
        }else{
            players.add(player);
            return true;
        }
    }

    public void matchResult(Team<T> opponent,int ourScore,int theirScore){
        String message;
        if(ourScore>theirScore){
            win++;
            message=" win ";
        }else if(ourScore<theirScore){
            loss++;
            message=" loss ";
        }else{
            tied++;
            message=" tied ";
        }played++;

        if(opponent!=null){
            System.out.println(this.getName()+message+opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int getSize(){
        return players.size();
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return (win*3+tied*2);
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.getRanking()>team.getRanking()){
            return -1;
        }else if(this.getRanking()<team.getRanking()){
            return 1;
        }else{
            return 0;
        }
    }
}
