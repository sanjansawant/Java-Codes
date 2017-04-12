package com.company;

import java.util.ArrayList;

/**
 * Created by sanja on 4/8/2017.
 */
public class Team<T extends Player> implements Comparable<Team<T>>{

    private ArrayList<T> player;
    private String name;
    private int played=0;
    private int win=0;
    private int loss=0;
    private int tied=0;


    public Team(String name){
        this.name=name;
        this.player=new ArrayList<>();

    }

    public boolean addPlayer(T member){

        if(player.contains(member)){
            System.out.println(member.getName()+" already exists");
            return false;
        }else{
            System.out.println(member.getName()+" added");
            player.add(member);
            return true;
        }
    }


    public void matchResult(Team<T> team, int ourScore, int theirScore){

        if(ourScore>theirScore){
           win++;
        }else if(ourScore<theirScore){
            loss++;
        }else if(ourScore==theirScore){
            tied++;
        }
        played++;
        toString();
        if(team!=null){
            team.matchResult(null,theirScore, ourScore);
        }
    }

    @Override
    public String toString() {
        return "Team{ " +getName()+
                " played=" + played +
                ", win=" + win +
                ", loss=" + loss +
                ", tied=" + tied +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.win>team.win){
            return 1;
        }else if(this.win<team.win){
            return -1;
        }else{
            return 0;
        }
    }

    public void setWin(int win) {
        this.win = win;
    }
}
