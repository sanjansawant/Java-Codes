package com.example.awtsample;
import java.util.*;
public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> value=new ArrayList<>();

        SoccerPlayer Beckham=new SoccerPlayer("Beckham");
        BaseBallPlayer pat=new BaseBallPlayer("pAT");
        FootBallPlayer joe=new FootBallPlayer("joe");
        Team<FootBallPlayer> sanjan=new Team<>("Sanjan");
        System.out.println(sanjan.numPlayers());
        //sanjan.addPlayer(Beckham);
        //sanjan.addPlayer(pat);
        sanjan.addPlayer(joe);
        Team<BaseBallPlayer> niranjan=new Team<>("niranjan");
        niranjan.addPlayer(pat);

        Team<FootBallPlayer> harihar=new Team<>("harihar");
        FootBallPlayer ronaldo=new FootBallPlayer("ronaldo");
        harihar.addPlayer(ronaldo);

        sanjan.matchResult(harihar,45,54);
        System.out.println("====================");
        System.out.println(harihar.ranking());
        System.out.println(sanjan.ranking());
        System.out.println(niranjan.ranking());
        System.out.println(sanjan.compareTo(harihar));
        League sanjana=new League("sanjana");




    }

   /* public static void printDouble(ArrayList<Integer> value){


        for(int i:value){

            System.out.println(i*2);
        }

    }*/
}
