package com.example.awtsample;

public class Main {

    public static void main(String[] args) {
        Team<CricketPlayer> harsh=new Team("Harsh");
        CricketPlayer sanjan=new CricketPlayer("sanjan");
        CricketPlayer niranjan=new CricketPlayer("niranjan");
        CricketPlayer oshan=new CricketPlayer("oshan");
        CricketPlayer Omkar=new CricketPlayer("Omkar");
        //FootBallPlayer anand=new FootBallPlayer("anand");
        harsh.addMember(sanjan);
        harsh.addMember(niranjan);
        harsh.addMember(oshan);
        harsh.addMember(Omkar);

        Team<CricketPlayer> zhubin=new Team<>("zhubin");
        CricketPlayer ronak=new CricketPlayer("ronak");
        CricketPlayer jigar=new CricketPlayer("jigar");
        CricketPlayer nisarg=new CricketPlayer("nisarg");
        CricketPlayer abhishek=new CricketPlayer("abhishek");
        zhubin.addMember(ronak);
        zhubin.addMember(jigar);
        zhubin.addMember(nisarg);
        zhubin.addMember(abhishek);

        harsh.matchResult(zhubin,45,56);
        System.out.println(harsh.getRanking());
        System.out.println(zhubin.getRanking());


        Team<CricketPlayer> anand=new Team<>("anand");
        CricketPlayer ronak1=new CricketPlayer("ronak");
        CricketPlayer jigar1=new CricketPlayer("jigar");
        CricketPlayer nisarg1=new CricketPlayer("nisarg");
        CricketPlayer abhishek1=new CricketPlayer("abhishek");
        anand.addMember(ronak1);
        anand.addMember(jigar1);
        anand.addMember(nisarg1);
        anand.addMember(abhishek1);
        anand.matchResult(zhubin,23,11);
        System.out.println(zhubin.compareTo(harsh));
        //System.out.println(zhubin.compareTo(anand));
        LeagueTable<Team<CricketPlayer>> mtnl=new LeagueTable<>("mtnl");
        mtnl.addTeams(zhubin);
        mtnl.addTeams(harsh);
        mtnl.addTeams(anand);
        mtnl.listLeague();


    }
}
