package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class Vehicle {

    private double size;
    private String name;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(double size, String name) {
        this.size = size;
        this.name = name;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {

        this.currentDirection += direction;
        System.out.println("==>"+this.currentDirection);

    }

    public void move(int direction, int velocity) {

        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println(this.currentVelocity+" *****  "+this.currentDirection);
    }

    public void stop() {
        this.currentVelocity=0;
        System.out.println("vehicle is in stop mode");

    }


    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }


}
