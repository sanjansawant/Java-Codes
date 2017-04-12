package com.Sanjan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanja on 1/7/2017.
 */
public class Player implements  ISaveable {

    private String name;
    private int hitpoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitpoints, int strength, String weapon) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = weapon;
    }


    @Override
    public List<String> read() {
        List<String> values=new ArrayList<>();
        values.set(0,this.name);
        values.set(1,""+this.getHitpoints());
        values.set(2,"" +this.strength);
        values.set(3,this.weapon);
        return values;
    }

    @Override
    public void write(List<String> values) {

        this.name=values.get(0);
        this.hitpoints=Integer.parseInt(values.get(1));
        this.strength=Integer.parseInt(values.get(2));
        this.weapon=values.get(3);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
