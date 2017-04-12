package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        Player sanjan=new Player();
        sanjan.health=20;
        sanjan.name="Sanjan";
        sanjan.weapon="sword";
        sanjan.damage(10);
        System.out.println("==>  "+sanjan.getHealth());
        sanjan.health=20;
        sanjan.damage(11);
        System.out.println("==>  "+sanjan.getHealth());

        EnhancedPlayer player=new EnhancedPlayer("sanjan",200,"sw");
        System.out.println(player.getHealth());
    }
}
