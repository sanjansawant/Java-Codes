package com.Sanjan;

import java.util.ArrayList;

/**
 * Created by sanja on 1/6/2017.
 */
import java.util.*;
public class Player implements IMedium {



    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;


    public Player(String name, int hitPoints, int strength, String weapon) {

        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public void read(List<String> values) {

        if(values !=null &&values.size()>0) {

            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);

        }
    }

    @Override
    public List<String> write() {
        List<String> values=new ArrayList<>();
        values.add(0,name);
        values.add(1,""+hitPoints);
        values.add(2,""+strength);
        values.add(3,weapon);

        return values;
    }






    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
