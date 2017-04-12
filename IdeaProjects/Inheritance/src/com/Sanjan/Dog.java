package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int brain,int body,String name,int eyes,int legs,int tail,int teeth,String coat){
        super(brain,body,1,32,name);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("dog.chew() is called");
    }


    public void walk(){
        System.out.println("dog.walk is called");
        super.move(5);

    }

    public void run(){
        System.out.println("dog.run is called");
        move(10);
    }

    @Override
    public void move(int speed){
        System.out.println("dog.move is called and "+speed);
        super.move(speed);

    }

    @Override
    public void eat() {
        System.out.println("dog.eat is called");
        chew();
        super.eat();
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}
