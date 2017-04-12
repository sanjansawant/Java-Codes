package com.Sanjan;

import java.util.LinkedList;

/**
 * Created by sanja on 12/31/2016.
 */
public class BasicHamburger {

    private String rollType;
    private double price;
    private String meat;
    private int count;
    private int value;


    public BasicHamburger(String rollType, double price, String meat) {
        this.rollType = rollType;
        this.price = price;
        this.meat = meat;


    }

    public void setCount(int count) {
        this.value=count;
        this.count = count;

    }

    public void addItem(String item, double price){
        count--;

        if (count>=0) {
            System.out.println("Item added "+item);
            this.price += price;
        }else{
            System.out.println("only "+value+" items sorry");
        }

    }

    public String getRollType() {
        return rollType;
    }

    public double getPrice() {
        return price;
    }

    public String getMeat() {
        return meat;
    }
}
