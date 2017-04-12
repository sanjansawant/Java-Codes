package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void damage(int damage){
        this.health-=damage;
        System.out.println("new health "+this.health);
        if(health<=0){
            System.out.println("player knpocked out");
            System.out.println("reduce the number of chance");
        }
    }

    public int getHealth(){
        return this.health;
    }

}
