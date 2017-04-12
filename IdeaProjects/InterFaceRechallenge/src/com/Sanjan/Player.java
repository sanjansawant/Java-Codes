package com.Sanjan;

import java.util.*;

/**
 * Created by sanja on 1/6/2017.
 */
public class Player implements ISaveable {

    private String name;
    private int strength;
    private int hitPoints;
    private String weapon;

    public Player(String name, int strength, int hitPoints, String weapon) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
        this.weapon = weapon;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.strength);
        values.add(2,""+this.hitPoints);
        values.add(3,this.weapon);

        return values;

    }

    @Override
    public void read(List<String> values) {

        this.name=values.get(0);
        this.hitPoints=Integer.parseInt(values.get(1));
        this.strength=Integer.parseInt(values.get(2));
        this.weapon=values.get(3);

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hitPoints=" + hitPoints +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
