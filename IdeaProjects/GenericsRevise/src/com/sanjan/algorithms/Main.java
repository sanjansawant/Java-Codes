package com.sanjan.algorithms;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<Team<CricketPlayer>> brothers=new LinkedList<>();
        Team<CricketPlayer> sanjana=new Team<>("India",2);
        CricketPlayer sanjan=new CricketPlayer("sanjan",23);
        sanjana.addPlayer(sanjan);
        sanjan=new CricketPlayer("niranjan",43);
        sanjana.addPlayer(sanjan);
        sanjan=new CricketPlayer("harihar",32);
        sanjana.addPlayer(sanjan);
        sanjan=new CricketPlayer("anupama",54);
        sanjana.addPlayer(sanjan);
        sanjan=new CricketPlayer("maha",34);
        sanjana.addPlayer(sanjan);
        brothers.add(sanjana);

        List<CricketPlayer> name=sanjana.getListofplayer();
        for(int i=0;i<name.size();i++){

            System.out.println(name.get(i).getName());

        }

        Team<CricketPlayer> nanjana=new Team<>("Australia",1);
        CricketPlayer sanjanq=new CricketPlayer("sanjan",23);
        nanjana.addPlayer(sanjanq);
        sanjanq=new CricketPlayer("niranjan",43);
        nanjana.addPlayer(sanjanq);
        sanjanq=new CricketPlayer("harihar",32);
        nanjana.addPlayer(sanjanq);
        sanjanq=new CricketPlayer("anupama",54);
        nanjana.addPlayer(sanjanq);
        sanjanq=new CricketPlayer("maha",34);
        nanjana.addPlayer(sanjanq);
        brothers.add(nanjana);
        Collections.sort(brothers);

        for(int i=0;i<brothers.size();i++){

            System.out.println(brothers.get(i));

        }

    }
}
