package com.company;

public class Main {

    public static void main(String[] args) {

        CricketPlayer gambhir=new CricketPlayer("Gautam",1);
        CricketPlayer lyin=new CricketPlayer("Chris",2);
        CricketPlayer uthappa=new CricketPlayer("Uthappa",3);
        Team<CricketPlayer> kkr=new Team<>("KKR");
        kkr.addPlayer(gambhir);
        kkr.addPlayer(lyin);
        kkr.addPlayer(uthappa);

        CricketPlayer kohli=new CricketPlayer("kohli",1);
        CricketPlayer gayle=new CricketPlayer("gayle",2);
        CricketPlayer deviller=new CricketPlayer("deviller",3);
        Team<CricketPlayer> rcb=new Team<>("RCB");
        rcb.addPlayer(kohli);
        rcb.addPlayer(gayle);
        rcb.addPlayer(deviller);


        FootBallPlayer beckham=new FootBallPlayer("beck",1);
        FootBallPlayer henry=new FootBallPlayer("henry",2);
        FootBallPlayer messi=new FootBallPlayer("messi",3);
        Team<FootBallPlayer> test=new Team<>("Test");
        test.addPlayer(beckham);
        test.addPlayer(henry);
        test.addPlayer(messi);




        rcb.setWin(3);
        kkr.setWin(15);
        System.out.println(kkr.toString());
        System.out.println(rcb.toString());
        System.out.println(rcb.compareTo(kkr));


        League<Team<CricketPlayer>> league=new League<>("IPL");
        league.addTeam(rcb);
        league.addTeam(kkr);

        league.teamInOrder();
    }
}
