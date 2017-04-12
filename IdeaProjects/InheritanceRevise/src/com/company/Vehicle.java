package com.company;

/**
 * Created by sanja on 3/26/2017.
 */
public class Vehicle {
    private double size;
    private String name;
    private double currentVelocity;
    private String currentDirection;

    public Vehicle(double size, String name) {
        this.size = size;
        this.name = name;
        this.currentVelocity = 0;
        this.currentDirection = "";
    }

    public void steer(String direction){
        this.currentDirection=direction;
    }

    public void stop(){
        this.currentVelocity=0;
    }

    public void move(String direction, double velocity){
        this.currentDirection=direction;
        this.currentVelocity=velocity;

    }

    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public double getCurrentVelocity() {
        return currentVelocity;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }
}
