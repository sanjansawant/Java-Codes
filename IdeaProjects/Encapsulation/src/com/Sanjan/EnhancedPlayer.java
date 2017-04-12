package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class EnhancedPlayer {
    private String name;
    private int health=100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health >= 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void damage(int damage){
        this.health-=damage;
        System.out.println("new health "+this.health);
        if(health<=0){
            System.out.println("player knpocked out");
            System.out.println("reduce the number of chance");
        }
    }

    public int getHealth() {
        return health;
    }
}
