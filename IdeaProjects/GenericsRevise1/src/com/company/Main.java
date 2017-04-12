package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Cricket sanjan=new Cricket("Sanjan","1");
        Cricket niranjan=new Cricket("niranjan","2");
        BaseBall michal=new BaseBall("michal","3");
        Team<Cricket> sanjana=new Team<>("sanjana",1);

        sanjana.addPlayers(sanjan);
        sanjana.addPlayers(niranjan);
        Team<Cricket> niranjana=new Team<>("niranjana",2);
        niranjana.addPlayers(sanjan);
        niranjana.addPlayers(niranjan);

        sanjana.scoreCard(niranjana,34,56);

        System.out.println(sanjana.toString());
        System.out.println(niranjana.toString());




    }
}
