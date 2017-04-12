package com.Sanjan;

public class Main {

    public static void main(String[] args) {


        ISaveable tim=new Player("tim",33,33,"sword");
        System.out.println(((Player)tim).getWeapon());



    }




}
