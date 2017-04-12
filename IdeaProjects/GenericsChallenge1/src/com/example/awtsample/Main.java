package com.example.awtsample;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        LeagueTable<CricketTeam> sanjan=new LeagueTable<>("sanjan");
        CricketTeam australia=new CricketTeam("australia",1);
        CricketTeam india=new CricketTeam("india",3);
        CricketTeam paki=new CricketTeam("paki",4);
        CricketTeam west=new CricketTeam("west",2);


        List getnames=sanjan.getTeams();

      for(int i=0;i<getnames.size();i++){


          System.out.println(getnames.get(i).g);
      }
    }
}
