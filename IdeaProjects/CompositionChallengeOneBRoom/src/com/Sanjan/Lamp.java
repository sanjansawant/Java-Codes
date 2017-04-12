package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class Lamp {
    private String style;
    private int globRating;
    private boolean battery;

    public Lamp(String style, int globRating, boolean battery) {
        this.style = style;
        this.globRating = globRating;
        this.battery = battery;
    }

    public void turnOn(){
        System.out.println("Lamp==> turn On");
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }
}
