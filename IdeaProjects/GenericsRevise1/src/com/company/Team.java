package com.company;

/**
 * Created by sanja on 4/3/2017.
 */
import java.util.*;
import java.util.concurrent.CompletionException;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private String name;
    private int ranking;
    private int win;
    private int loss;
    private int draw;
    private int played;
    private ArrayList<T> players;

    public Team(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
        this.players=new ArrayList<T>();
    }

    public boolean addPlayers(T player){
        if(players.contains(player)){
            System.out.println("Cannot be added");
            return false;
        }else{
            players.add(player);
            return true;
        }

    }


    public void scoreCard(Team team, int ourScore, int theirScore){

        if(ourScore>theirScore){
            win++;
        }else if(ourScore<theirScore){
            loss++;
        }else{
            draw++;
        }played++;
        if(team!=null) {
            team.scoreCard(null, theirScore, ourScore);
        }
    }


    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }


    @Override
    public String toString() {
        return "Team{" +getName()+
                " win=" + win +
                ", loss=" + loss +
                ", draw=" + draw +
                ", played=" + played +
                '}';
    }

    @Override
    public int compareTo(Team<T> o) {

        if(this.getRanking()>o.getRanking()){
            return 1;
        }else if(this.getRanking()<o.getRanking()){
            return -1;
        }else{
            return 0;
        }
    }
}
